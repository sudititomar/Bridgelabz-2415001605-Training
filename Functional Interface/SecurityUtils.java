interface SecurityUtils {
    static boolean isStrong(String pwd) {
        return pwd.length() >= 8 && pwd.matches(".*[!@#$%^&*].*");
    }
}
System.out.println(SecurityUtils.isStrong("Pass@123")); // true

