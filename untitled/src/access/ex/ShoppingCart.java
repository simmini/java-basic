package access.ex;

public class ShoppingCart {
    private Item[] items=new Item[10];
    private int itemCount;


    public void addItem(Item item){
        //검증로직
       if(itemCount>=items.length){
           System.out.println("장바구니가 가득 찼습니다.");
           return;
        }
           items[itemCount]=item;
            itemCount++;
        }
        public void displayItems(){
            int sum=0;
            //배열이 차있는 정도만 출력해야기 떼문에 다출력돌리면 nullPoint에러뜸
            for(int i=0;i<itemCount;i++){
                    System.out.println("상품명:"+items[i].getName()+ " ,합계"+items[i].getTotalPrice() );
                    //sum+=items[i].getTotalPrice();
            }
            System.out.println("전체 가격 합: "+calculateTotalPrice());
        }

        //전체 가격합을 고칠떄 여기만 고치면 되서 따로 뺴놓는거에 의미가 있음
        private int calculateTotalPrice(){
            int totalPrice=0;
            for(int i=0;i<itemCount;i++){
                Item item=items[i];
                totalPrice+=item.getTotalPrice();

            }
            return totalPrice;
        }
    }
