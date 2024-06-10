package nested.nested.ex2;

public class Network {

    public void sendMessage(String text) {
        NetworkMessage networkMessage = new NetworkMessage(text);
        networkMessage.print();
    }

    private static class NetworkMessage { // 클래스 중첩, 외부에서 new Network.NetworkMessage() 접근 안됨. 내부에서만 사용하는 클래스

        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }
}
