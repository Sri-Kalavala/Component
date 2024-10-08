public abstract class SecureSecondary implements Secure {
    protected String key;
    protected String message;
    protected boolean encrypted;

    @Override
    public void setKey(String key) {
        this.key = key;
    }
    
    @Override
    public String generateHash() {
        return Integer.toHexString(message.hashCode());
    }
}
