public class rasional {
    private int pembilang, penyebut;
    public rasional(){
        pembilang = 0;
        penyebut = 0;
    }
    public rasional (int pbl, int pyb){
        pembilang = pbl;
        penyebut = pyb;
    }
    public boolean isRasional(){
        return (penyebut != 1);
    }
    public void sederhana(){
        int temp, a, b;
        if(penyebut == 0){
            return;
        }
        a = (pembilang < penyebut) ? penyebut : pembilang;
        b = (pembilang > penyebut) ? pembilang : penyebut;
        for(; b != 0; ){
            temp = a % b;
            a = b;
            b = temp;
        }
        pembilang /= a;
        penyebut /= a;
    }
    public double cast (){
        return (penyebut == 0) ? 0.0 : (double)pembilang/(double)penyebut;
    }
    public boolean moreThan (rasional a){
        return (pembilang * a.penyebut > penyebut * a.pembilang);
    }
    public boolean lessThan(rasional a){
        return (pembilang * a.penyebut < penyebut * a.pembilang);
    }
    public boolean lessEqual(rasional a){
        return (pembilang * a.penyebut <= penyebut * a.pembilang);
    }
    public boolean moreEqual(rasional a){
        return (pembilang * a.penyebut >= penyebut * a.pembilang);
    }
    public boolean notEqual(rasional a){
        return (pembilang * a.penyebut != penyebut * a.pembilang);
    }
    public void negasi(){
        pembilang = -pembilang;
    }
    public void unaryPlus(rasional a){
        pembilang = pembilang * a.penyebut + penyebut * a.pembilang;
        penyebut = penyebut * a.penyebut;
    }
    public void minus(rasional a){
        pembilang = pembilang * a.penyebut - penyebut * a.pembilang;
        penyebut = penyebut * a.penyebut;
    }
    public void kali(rasional a){
        pembilang = pembilang * a.pembilang;
        penyebut = penyebut * a.penyebut;
    }
    public void bagi(rasional a){
        pembilang = pembilang * a.penyebut;
        penyebut = penyebut * a.pembilang;
    }
    public void cetak(){
        System.out.println(pembilang + "/" + penyebut);
    }

}