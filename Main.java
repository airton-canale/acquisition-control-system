public class Main{
        public static void main(String[] args) {

            Departamento financeiro = new Departamento("Financeiro", 10000);
            Departamento rh = new Departamento("RH", 5000);
            
            Funcionario func1 = new Funcionario("João", financeiro);
            Funcionario func2 = new Funcionario("Maria", rh);
    
            Pedido pedido = new Pedido(func1);
            pedido.adicionarItem(new Item("Computador", 2000, 2));
            
            System.out.println("Total do Pedido: " + pedido.calcularTotal());
            pedido.aprovarPedido();
            System.out.println("Status do Pedido: " + pedido.getStatus());
        }
    }
    
