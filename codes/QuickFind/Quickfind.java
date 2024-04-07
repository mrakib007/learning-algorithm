public class Quickfind {
    private int[] id;

    public Quickfind(int N) {
        id = new int[N];
        for (int i = 0; i < N; i++) {
            id[i] = i;
        }
    }

    public void union(int p, int q) {
        int pid = id[p];
        int qid = id[q];
        for (int i = 0; i < id.length; i++) {
            if (id[i] == pid) {
                id[i] = qid;
            }
        }
    }

    public boolean connected(int p, int q) {
        return id[p] == id[q];
    }

    public static void main(String[] args) {
        Quickfind qf = new Quickfind(10);
        qf.union(5, 6);
        qf.union(3, 8);
        System.out.println(qf.connected(5, 6));
        System.out.println(qf.connected(1, 9));
    }
}