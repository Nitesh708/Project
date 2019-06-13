/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Userwr {
     private String fn,ln,em,mn,co,br,work;
    public Userwr(String fn,String ln,String em,String mn,String co,String br,String work)
    {
        this.fn=fn;
        this.ln=ln;
        this.em=em;
        this.mn=mn;
        this.co=co;
        this.br=br;
        this.work=work;
    }

    Userwr(String string, String string0, String string1, String string2, String string3, String string4) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String  getfn()
    {
        return fn;
    }
    public String  getln()
    {
        return ln;
    }
    public String  getem()
    {
        return em;
    }
    public String  getmn()
    {
        return mn;
    }
    public String  getco()
    {
        return co;
    }
    public String  getbr()
    {
        return br;
    }
     public String  getwork()
    {
        return work;
    }
    
}
