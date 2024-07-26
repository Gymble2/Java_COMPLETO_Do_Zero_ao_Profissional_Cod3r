package modelo;


import java.util.ArrayList;
import java.util.List;





public class Campo {
    
    
    private final int coluna;
    private final int linha;

    private boolean aberto;
    private boolean minado;
    private boolean marcado;

    private List<Campo> vizinhos = new ArrayList<>();
    private List<CampoObersvador> observadores = new ArrayList<>();
    //private List<BiConsumer<Campo, CampoEvento>>
    //        obsrvadores2 = new ArrayList<>();
    public Object isMinado;

    public Campo(int linha, int coluna) {
        this.linha = linha;
        this.coluna = coluna;
    }

    public void regirtrarObservador(CampoObersvador observador){
        observadores.add(observador);
    }

    private void notificarObservadores(CampoEvento evento){
        observadores.stream()
            .forEach(o -> o.eventoOcorreu(this, evento));
    }

    public boolean adicionarVizinho(Campo vizinho){
        boolean linhaDiferente = linha != vizinho.linha;
        boolean colunaDiferente = coluna != vizinho.coluna;
        boolean diagonal = linhaDiferente && colunaDiferente;

        int deltaLinha= Math.abs(linha - vizinho.linha);
        int deltaColuna = Math.abs(coluna - vizinho.coluna);
        int deltaGeral = deltaColuna+deltaLinha;

        if(deltaGeral == 1 && !diagonal){
            vizinhos.add(vizinho);
            return true;
        }else if(deltaGeral == 2 && diagonal){
            vizinhos.add(vizinho);
            return true;
        }else{
            return false;
        }
    }

    public void alternarMarcado(){
        if(!aberto){
            marcado = !marcado;

            if(marcado){
                notificarObservadores(CampoEvento.MARCAR);
            }else{
                notificarObservadores(CampoEvento.DESMARCAR);
            }
        }
    }

    public boolean vizinhancaSegura(){
        return vizinhos.stream().noneMatch(v -> v.minado);
    }

    public boolean abrir(){
        if(!aberto && !marcado){
            if(minado){
                //FIXME é pra algo pra concertar
                notificarObservadores(CampoEvento.EXPLODIR);
                return true;
            }

            setAberto(true);

            if(vizinhancaSegura()){
                vizinhos.forEach(v -> v.abrir());
            }

            return true;
        }else{
            return false;
        }
    }

    public void minar(){
        minado = true;
    }

    public boolean isMarcado(){
        return marcado;
    }

    public boolean isAberto(){
        return aberto;
    }

    public boolean isFechado(){
        return !isAberto();
    }

    public boolean isMinado(){
        return minado;
    }

    void setAberto(Boolean aberto){
        this.aberto = aberto;

        if(aberto){
            notificarObservadores(CampoEvento.ABRIR);
        }
    }

    public int getColuna() {
        return coluna;
    }

    public int getLinha() {
        return linha;
    }

    public boolean obetivoAlcancado(){
        boolean desvendado = !minado && aberto;
        boolean protegido = minado && aberto;
        return desvendado || protegido;
    }

    public long minasNaVizinhanca(){
        return vizinhos.stream().filter(v -> v.minado).count();
    }
 
    public void reiniciar(){
        aberto = false;
        minado = false;
        marcado = false;
    }

    
}  

