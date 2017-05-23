package concessionaria;

    public class Funcionarios {
        
        private String nomeCompleto;
        private String cpf;
        private int registro;
        private double totalVendas;
        private double horasExtras;
        private double salarioBase;
        private static double taxaComissao = 0.3;
        
        public Funcionarios(String n, String c, int r, double sal, double horas){
            this.nomeCompleto = n;
            this.cpf = c;
            this.registro = r;
            this.salarioBase = sal;
            this.horasExtras = horas;
        }
        
        public String getNomeCompleto(){
            return this.nomeCompleto;
        }
        
        public String setNomeCompleto(String nome){
            this.nomeCompleto = nome;
            return nome;
        }
        
        public double getSalarioBase(){
            return this.salarioBase;
        }
        
        public double setSalarioBase(double salario){
            this.salarioBase = salario;
            return salario;
        }
        
        public String getCpf(){
            return this.cpf;
        }
        
        public String setCpf(String n){
            this.cpf = n;
            return n;
        }
        
        public int getRegistro(){
            return this.registro;
        }
        
        public int setRegistro(int reg){
            this.registro = reg;
            return reg;
        }
        
        public double getTaxaComissao(){
            return this.taxaComissao;
        }
        
        public double setTaxaComissao(double com){
            this.taxaComissao = com;
            return com;
        }
        
        public double getHorasExtras(){
            return this.horasExtras;
        }
        
        public double setHorasExtras(double h){
            this.horasExtras = h;
            return h;
        }
        
        public double calcularComissao (){
            return Funcionarios.taxaComissao * this.totalVendas;
        }
        
        public double calcularSalarioMes (){
            return this.salarioBase + this.horasExtras + this.calcularComissao();
        }
        
        public double calcularDecimoTerceiro(){
            return this.salarioBase;
        }
        
        public double calcularFerias(){
            return this.salarioBase + this.calcularDecimoTerceiro();
            
        }
        
        public double contabilizarVenda(double valor){
            if (valor > 0){
                this.totalVendas = valor + this.totalVendas;
                return this.totalVendas;
            }
            return 0;
        }
        
        public void exibirResumo(){
            System.out.println("Registro:" + this.registro );
            System.out.println("Nome completo:" + this.nomeCompleto );
            System.out.println("Cpf:" + this.cpf );
            System.out.println("Total de vendas:" + this.totalVendas );
            System.out.println("Horas extras:" + this.horasExtras );
            System.out.println("Salario do mês:" + this.calcularSalarioMes() );
            System.out.println("Comissão:" + this.calcularComissao() );
            System.out.println("Decimo Terceiro:" + this.calcularDecimoTerceiro() );
            System.out.println("Férias:" + this.calcularFerias() );
            
            
            
        }
}
