package work1;

public class Booth {
    private long id;
    private String name;
    private int total;
    private boolean isClosed;
    public Booth(){
    }

    public Booth(long id,String name,int total,boolean isClosed){
        this.id =  id;
        this.name = name;
        this.total = total;
        this.isClosed = isClosed;
    }
    //����������Ӧ�� get �� set ����

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getTotal(){
        return total;
    }
    public void setTotal(int total){
        this.total = total;
    }
    public boolean getIsClosed(){
        return isClosed;
    }
    public void setIsClosed(boolean isClosed){
        this.isClosed = isClosed;
    }

    //һ����д�� toString()��������� ������̯��������Ϣ��Ҫ��һ���ĸ�ʽ\
    public  String toString(){
        return "The booth id: "+getId()+"\n"+"the name of booth owner: "+getName()+"\n"+"the number of watermelons on sale: "+getTotal()+"\n"+"Whether to stop amortization rectification:  "+getIsClosed();
    }

    //һ����̬(static)���� purchase��Booth �̼�, int ����������, ��Ŀ��̯λ���� ����ָ�����������ϡ� ���������������Ϊ�������̼Ҳ��ܴ�����̯����״̬���������������ܴ��������� �������������������Ϊ����ʧ�ܣ�̯���������������������仯�� ���۽��׳ɹ���񣬶�Ҫ���һ������ʾ��Ϣ
    public static  void purchase(Booth booth, int buy){
        long id = booth.getId();
        String name = booth.getName();
        int total = booth.getTotal();
        boolean isClosed = booth.getIsClosed();
        if(!isClosed){
            System.out.println("The business cannot be in a state of rectification");
        }else if(total<=0){
            System.out.println("The number of watermelons purchased must be positive");
        }else if(buy>total){
            System.out.println("The number of watermelons purchased cannot be greater than the number of watermelons on sale");
        }else{
            System.out.println("Successful purchase");
            booth.setTotal(total-buy);
        }
    }

    //һ��ʵ������ restock(int ����������),Ϊ��Ӧ̯λ���������ν��������ܳ��� 200������ʧ���������Ӧ����ʾ��Ϣ��
    public void restock(int stock){
        if(stock>200){
            System.out.println("Failed to stock");
        }else{
            System.out.println("Successful stock");
        }
    }

    public static void closeBooths(Booth[] booths) {
        for (Booth booth : booths) {
            if (booth.getIsClosed()) {
                System.out.println(booth.toString());
            } else {
                booth.setIsClosed(true);
            }
        }
    }
}
