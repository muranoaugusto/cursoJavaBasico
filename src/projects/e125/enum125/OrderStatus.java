package projects.e125.enum125;

public enum OrderStatus {
    PENDING_PAYMENT (0),
    PROCESSESING (1),
    SHIPPED (2),
    DELIVERED (3);

    private int ordercode;

    OrderStatus (int ordercode){
        this.ordercode = ordercode;
        }

    public int getOrderCode() {
            return ordercode;
        }
    
    public static OrderStatus osFromCode(int ordercode) {
        for (OrderStatus code : values()) {
            if (code.getOrderCode() == ordercode) {
                return code;    
                }
            }
            throw new IllegalArgumentException("Código inválido: " + ordercode);
        }

}
