
import java.util.Date;

public class Client extends Person {

    private int idClient;
    private Date registerDate;
    private boolean vip;
    private static int clientCounter;

    public Client(Date registerDate, boolean vip) {
        this.idClient = ++clientCounter;
        this.registerDate = registerDate;
        this.vip = vip;
    }

    public int getIdClient() {
        return idClient;
    }

    public void setIdClient(int idClient) {
        this.idClient = idClient;
    }

    public Date getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }

    public static int getClientCounter() {
        return clientCounter;
    }

    @Override
    public String toString() {
        return super.toString() + "Client{" + "idClient=" + idClient + ", registerDate= " + registerDate + ", vip= " + vip + '}';
    }

}
