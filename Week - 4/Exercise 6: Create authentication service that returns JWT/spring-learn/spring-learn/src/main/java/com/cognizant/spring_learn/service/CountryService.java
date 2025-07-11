@RestController
public class AuthenticationController {
    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
        String[] creds = new String(Base64.getDecoder().decode(authHeader.substring(6))).split(":");
        String user = creds[0], password = creds[1];

        if ("user".equals(user) && "pwd".equals(password)) {
            String token = JwtUtil.generateToken(user);
            return Collections.singletonMap("token", token);
        } else {
            throw new ResponseStatusException(HttpStatus.UNAUTHORIZED, "Invalid credentials");
        }
    }
}
