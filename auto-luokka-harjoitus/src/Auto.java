public class Auto {
    public String merkki;
    public String malli;
    public double bensanMaara;

    //Parametrinen konstruktori
    public Auto(String merkki, String malli, double bensanMaara)
    {
        this.merkki = merkki;
        this.malli = malli;
        this.bensanMaara = bensanMaara;
    }

    //Parametritön konstruktori
    public Auto()
    {
        this.merkki = "";
        this.malli = "";
        this.bensanMaara = 0.0;
    }
    //jarruta-metodi tulostaa "Auto jarruttaa"
    public void jarruta()
    {
        System.out.println("Auto jarruttaa");
    }
    //kiihdytä-metodi tulostaa "Auto kiihtyy" jos bensaa on enemmän kuin 0
    public void kiihdyta()
    {
        
        if (bensanMaara > 0)
         {
            System.out.println("Auto kiihtyy");
            bensanMaara --;
        }
        else
        {
            System.out.println("Bensa loppu");
        }
    }

    public void printData()
    {
        System.out.println("Merkki: " + merkki);
        System.out.println("Malli: " + malli);
        System.out.println("Bensan määrä: " + bensanMaara + " litraa");
    }
    //tankkaa-metodi tulostaa bensan määrän, tankattavan määrän ja niiden summan.
    public void refuel(double tankkausMaara){
        if (tankkausMaara > 0) 
        {
            System.out.println("Tankissa bensaa: " + bensanMaara);
            System.out.println("Tankkaus: " + tankkausMaara);
            bensanMaara += tankkausMaara;
            System.out.println("Tankissa bensaa tankkauksen jälkeen: " + bensanMaara);
        }
       
    }
        
}
    
    


