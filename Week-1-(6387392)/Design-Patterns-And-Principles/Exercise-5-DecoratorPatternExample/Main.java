public class Main {
    public static void main(String[] args) {
        Notifier basicNotifier = new EmailNotifier();
        Notifier smsNotifier = new SMSNotifierDecorator(basicNotifier);
        Notifier slackNotifier = new SlackNotifierDecorator(smsNotifier);

        slackNotifier.send("System is down!");
    }
}
