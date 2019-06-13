/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
class User {
    private String fn,ln,em,mn,br,nom,comp;
    public User(String fn,String ln,String em,String mn,String br,String nom,String comp)
    {
        this.fn=fn;
        this.ln=ln;
        this.em=em;
        this.mn=mn;
        this.br=br;
        this.nom=nom; 
        this.comp=comp;
    }

    User(String string, String string0, String string1, String string2, String string3, String string4) {
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
    public String  getbr()
    {
        return br;
    }
    public String  getnom()
    {
        return nom;
    }
     public String  getcomp()
    {
        return comp;
    }
}
