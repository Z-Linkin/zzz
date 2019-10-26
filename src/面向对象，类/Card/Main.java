package Card;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public class Main {
    public static void main(String[] args) {
        Card.OutputPoker();

        CardTable cardTable1=new CardTable(0);
        Player player1=new Player("张洎崯",300);
        Player player2=new Player("张开航",250);

        System.out.println(player1.getMoney());
        System.out.println(player2.getMoney());

        player1.GetCard();
        player2.GetCard();

        player1.display(player1);
        player2.display(player2);

        player1.Start(player1,player2,cardTable1.getTableMoney());
    }
}
