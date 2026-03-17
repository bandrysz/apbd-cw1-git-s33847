public class Main {

    public static void main(String[] args) {
        int x=10;
        int y=3;

        System.out.println("Dzialania na dwoch liczbach "+x+" "+y);
        Dodawanie d = new Dodawanie(x,y);
        System.out.println("Wynik dodawania: "+d.wynik);
        Odejmowanie o = new Odejmowanie(x,y);
        System.out.println("Wynik odejmowania: "+o.wynik);
        Mnozenie m = new Mnozenie(x,y);
        System.out.println("Wynik mnozenia: "+m.wynik);
    }

    public double calculateAvarage(int [] tab){
        int sum=0;
        int c=0;
        for (int i = 0; i < tab.length; i++){
            sum=sum+tab[i];
            c=c+1;
        }
        return sum/c;
    }
    public int calculateMax(int [] tab){
        int max=0;
        for (int i = 0; i < tab.length; i++){
            if (tab[i]>max){
                max=tab[i];
            }
        }
        return max;
    }
    public int calculateMin(int [] tab){
        if(tab.length==0){
            return 0;
        }
        int minimum=tab[0];
        for (int i = 0; i < tab.length; i++){
            if (tab[i]<minimum){
                minimum=tab[i];
            }
        }
        return minimum;
    }
}
