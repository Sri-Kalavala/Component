public class Secure1L extends SecureSecondary {

    public Secure1L(String message) {
        this.message = message;
        this.encrypted = false;
    }

    @Override
    public void encrypt() {
        if (key != null && !encrypted) {
            StringBuilder encryptedMessage = new StringBuilder();
            for (char c : message.toCharArray()) {
                // I wanted to use the Caesar Cipher because it looked easy and cool :)
                encryptedMessage.append((char) (c + 3));
            }
            message = encryptedMessage.toString();
            encrypted = true;
        }
    }

    @Override
    public String decrypt() {
        // I still need to write code for this question
        return "";
    }

    @Override
    public boolean isEncrypted() {
        return encrypted;
    }

    public static void main(String[] args) {
        Secure secureMessage = new Secure1L("Hello World");
        secureMessage.setKey("secretKey");

        secureMessage.encrypt();
        System.out.println("Encrypted message: " + secureMessage.decrypt());

        System.out.println("Hash: " + secureMessage.generateHash());
        System.out.println("Is Encrypted: " + secureMessage.isEncrypted());

        secureMessage.decrypt();
        System.out.println("Decrypted message: " + secureMessage.decrypt());
    }
}
