import java.util.*;

public class DepHashSet implements IDep<Dep>{
    Set<Dep> listDep = new HashSet<Dep>();

    @Override
    public void ajouterDepartement(Dep dep) {
        this.listDep.add(dep);
    }

    @Override
    public boolean rechercherDepartement(String nom) {
        for (Dep dep : this.listDep) {
            if (dep.getName().equals(nom))
                return true;
        }
        return false;
    }

    @Override
    public boolean rechercherDepartement(Dep dep) {
        for (Dep dep1 : this.listDep) {
            if (dep1.equals(dep))
                return true;
        }
        return false;
    }

    @Override
    public void supprimerDepartement(Dep dep) {
        this.listDep.remove(dep);
    }

    @Override
    public void displayDepartement() {
        Iterator<Dep> iterator = this.listDep.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Override
    public TreeSet<Dep> trierDepartementById() {
        Comparator<Dep> comparator = new Comparator<Dep>() {
            @Override
            public int compare(Dep o1, Dep o2) {
                return o1.getId() - o2.getId();
            }
        };
        TreeSet<Dep> treeSet = new TreeSet<Dep>(comparator);
        treeSet.addAll(this.listDep);
        return treeSet;
    }


}
