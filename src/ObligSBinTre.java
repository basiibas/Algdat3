import java.util.*;
public class ObligSBinTre<T> implements Beholder<T>
{
    private static final class Node<T> // en indre nodeklasse
    {
        private T verdi; // nodens verdi
        private Node<T> venstre, høyre; // venstre og høyre barn
        private Node<T> forelder; // forelder
        // konstruktør
        private Node(T verdi, Node<T> v, Node<T> h, Node<T> forelder)
        {
            this.verdi = verdi;
            venstre = v; høyre = h;
            this.forelder = forelder;
        }
        private Node(T verdi, Node<T> forelder) // konstruktør
        {
            this(verdi, null, null, forelder);
        }
        @Override
        public String toString(){ return "" + verdi;}
    }
    // class Node
    private Node<T> rot; // peker til rotnoden
    private int antall; // antall noder
    private int endringer; // antall endringer
    private final Comparator<? super T> comp; // komparator
    public ObligSBinTre(Comparator<? super T> c) // konstruktør
    {
        rot = null;
        antall = 0;
        comp = c;
    }

    //Oppgave 1
    @Override
    public boolean leggInn(T verdi)
    {
        Objects.requireNonNull(verdi, "Ulovlig med nullverdier!");

        Node<T> m = rot, q = null;
        int cmp = 0;

        while (m != null)
        {
            q = m;
            cmp = comp.compare(verdi,m.verdi);
            m = cmp < 0 ? m.venstre : m.høyre;
        }

        m = new Node<>(verdi,null);

        if (q == null) rot = m;
        else if (cmp < 0){
            q.venstre = m;
            m.forelder = q;
        }
        else{
            q.høyre = m;
            m.forelder = q;
        }

        antall++;
        return true;
    }

    @Override
    public boolean inneholder(T verdi)
    {
        if (verdi == null) return false;
        Node<T> p = rot;
        while (p != null)
        {
            int cmp = comp.compare(verdi, p.verdi);
            if (cmp < 0) p = p.venstre;
            else if (cmp > 0) p = p.høyre;
            else return true;
        }
        return false;
    }

    @Override
    public boolean fjern(T verdi)
    {
        throw new UnsupportedOperationException("Ikke kodet ennå!");
    }

    public int fjernAlle(T verdi)
    {
        throw new UnsupportedOperationException("Ikke kodet ennå!");
    }

    @Override
    public int antall()
    {
        return antall;
    }


    public void Comp(){

    }
    //Oppgave2
    public int antall(T verdi)
    {
        Node<T> p = rot; //reff node
        int duplikater = 0;

        while (p != null) // så lenge det finnes noder
        {
            int sam = comp.compare(verdi,p.verdi); //sammenligner verdi med p sin verdi
            if (sam > 0) p = p.høyre;
            else if(sam < 0) p=p.venstre;

            else
            {
                if (sam == 0) duplikater++;
                p = p.høyre;
            }
        }
        return duplikater;
    }







    @Override
    public boolean tom()
    {
        return antall == 0;
    }

    @Override
    public void nullstill()
    {
        throw new UnsupportedOperationException("Ikke kodet ennå!");
    }

    private static <T> Node<T> nesteInorden(Node<T> p)
    {
        if(p.forelder == null && p.høyre == null){
            return p;
        }
        if(p.høyre != null){
            p = p.høyre;
            while(p.venstre != null){
                p = p.venstre;
            }
            return p;
        }
        if(p == p.forelder.venstre){
            return p.forelder;
        }
        while(p.forelder.forelder != null && p.forelder == p.forelder.forelder.høyre){
            p = p.forelder;
        }
        return p.forelder.forelder;
    }

    @Override
    public String toString()
    {
        if(tom()) {return "[]";}
        Node<T> p = rot;
        while(p.venstre != null){
            p = p.venstre;
        }
        StringJoiner sj = new StringJoiner(", ", "[", "]");
        for(int i = 0; i < antall; i++) {
            sj.add(p.toString());
            p = nesteInorden(p);
        }
        return sj.toString();
    }

    public String omvendtString()
    {
        throw new UnsupportedOperationException("Ikke kodet ennå!");
    }

    public String høyreGren()
    {
        throw new UnsupportedOperationException("Ikke kodet ennå!");
    }

    public String lengstGren()
    {
        throw new UnsupportedOperationException("Ikke kodet ennå!");
    }

    public String[] grener()
    {
        throw new UnsupportedOperationException("Ikke kodet ennå!");
    }

    public String bladnodeverdier()
    {
        throw new UnsupportedOperationException("Ikke kodet ennå!");
    }

    public String postString()
    {
        throw new UnsupportedOperationException("Ikke kodet ennå!");
    }

    @Override
    public Iterator<T> iterator()
    {
        return new BladnodeIterator();
    }

    private class BladnodeIterator implements Iterator<T>
    {
        private Node<T> p = rot, q = null;
        private boolean removeOK = false;
        private int iteratorendringer = endringer;

        private BladnodeIterator() // konstruktør
        {
            throw new UnsupportedOperationException("Ikke kodet ennå!");
        }

        @Override
        public boolean hasNext()
        {
            return p != null; // Denne skal ikke endres!
        }

        @Override
        public T next()
        {
            throw new UnsupportedOperationException("Ikke kodet ennå!");
        }

        @Override
        public void remove()
        {
            throw new UnsupportedOperationException("Ikke kodet ennå!");
        }
    } // BladnodeIterator
} // ObligSBinTre