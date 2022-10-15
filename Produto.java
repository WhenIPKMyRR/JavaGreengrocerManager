import java.util.ArrayList;

public class Produto extends Generic {
    public String descricao;
    public String tamanho;
    public String cor;
    public ArrayList<Fabricante> fabricantes;

    public static ArrayList<Produto> produtos = new ArrayList<>();

    public Produto(
        String descricao,
        String tamanho,
        String cor
    ) {
        super.id= id;
        this.descricao = descricao;
        this.tamanho = tamanho;
        this.cor = cor;
        this.fabricantes = new ArrayList<>();
        
        produtos.add(this);
    }

    public static Produto verificarId(int id) throws Exception {
        for (Produto produto : produtos) {
            if (produto.id == id) {
                return produto;
            }
        }
        throw new Exception("Produto não existe");
    }

    private int getNextId() {
        int id = 0;

        for (Produto produto : produtos) {
            if (produto.id > id) {
                id = produto.id;
            }
        }
        
        return id + 1;

    } 
}
