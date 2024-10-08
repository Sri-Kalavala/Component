public interface Secure extends SecureKernel {
    void setKey(String key);
    String generateHash();
}
