public class Booth {
    private long id;
    private String name;
    private int total;
    private boolean isClosed;

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isClosed() {
        return this.isClosed;
    }

    public void setClosed(boolean closed) {
        this.isClosed = closed;
    }

    public int getTotal() {
        return this.total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public String toString() {
        return "id=" + this.id + ", name='" + this.name + '\'' + ", total=" + this.total + ", isClosed=" + this.isClosed;
    }

    public Booth(long id, String name, int total, boolean isClosed) {
        this.id = id;
        this.name = name;
        this.total = total;
        this.isClosed = isClosed;
    }

    public static void purchase(Booth merchant, int need) {
        boolean pass = true;
        if (need < 0) {
            pass = false;
            System.out.println("������������Ϊ����");
        }

        if (merchant.isClosed()) {
            pass = false;
            System.out.println("�̼Ҳ��ܴ�����̯����״̬");
        }

        if (need > merchant.getTotal()) {
            pass = false;
            System.out.println("�̼Ҳ��ܴ�����̯����״̬");
        }

        if (pass) {
            merchant.setTotal(merchant.getTotal() - need);
            System.out.println("���׳ɹ�");
        }

    }

    public void restock(int add) {
        boolean pass = true;
        if (add < 0) {
            pass = false;
            System.out.println("��������Ϊ����");
        }

        if (add > 200) {
            pass = false;
            System.out.println("�����������200");
        }

        if (pass) {
            this.setTotal(this.getTotal() + add);
            System.out.println("�����ɹ�");
        }

    }

    public static void closeBooths(Booth[] booths) {
        for(int i = 0; i < booths.length; ++i) {
            if (booths[i].isClosed()) {
                System.out.println(booths[i].toString());
            } else {
                booths[i].setClosed(true);
            }
        }

    }
}