import java.util.Scanner;

public class Nokia{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
//        int selected;
        String mainMenu = """
Choose a menu
1.  Phone book
2.  Messages
3.  Chat
4.  Call Register
5.  Tones
6.  Settings
7.  Call divert
8.  Games
9.  Calculator
10. Reminders
11. Clock
12. Profiles
13. SIM Services
""" ;
        String phoneBook = """
1.  Search
2.  Service Nos
3.  Add name
4.  Erase
5.  Edit
6.  Assign tone
7.  Send b'card
8.  Options
9.  Speed dials
10. Voice tags
""";
        String messages = """
1.  Write messages
2.  Inbox
3.  Outbox
4.  Picture messages
5.  Templates
6.  Smileys
7.  Message settings
8.  Info service
9.  Voice mailbox number
10. Service command editor  
""";
        String callRegister = """
1.  Missed calls
2.  Recieved Calls
3.  Dialed numbers
4.  Erase recent call lists
5.  Show call duration
6.  Show call costs
7.  Call cost setting
8.  Prepaid credit
""";
        String tones = """
1.  Ringing tone
2.  Ringing volume
3.  Incoming call alert
4.  Composer
5.  Message alert tone
6.  Keypad tones
7.  Warning and game tones
8.  Vibrating alert
9.  Screen saver
""";
        String settings = """
1.  Call settings
2.  Phone settings
3.  Security settings
4.  Restore factory settings
""";
        String clockMenu = """
1.  Alarm clock
2.  Clock settings
3.  Date setting
4.  Stopwatch
5.  Countdown timer
6.  Auto update of date and time
""";
        String phoneBookOption = """
Options
1.  Type of view
2.  Memory status
""";
        String messageSettingsOption = """
1.  Set 1
2.  Common
""";
        String setOneOption = """
1.  Message centre number
2.  Messages sent as
3.  Message validity
""";
        String commonSetting = """
1.  Delivery reports
2.  Reply via same centre
3.  Character support
""";
        String callRegisterOption = """
Call Register
1.  Missed calls
2.  Received calls
3.  Dialled numbers
4.  Erase recent call lists
5.  Show call duration
6.  Show call costs
7.  Call cost settings
8.  Prepaid credit
""";
        String showCallDurationOption = """
Show call duration
1.  Last call duration
2.  All calls’ duration
3.  Received calls’ duration
4.  Dialled calls’ duration
5.  Clear timers
""";
        String showCallCost = """
Show call cost
1.  Last call cost
2.  All calls’ cost
3.  Clear counters
""";
        String callCostSetting = """
Call cost settings
1.  Call cost limit
2.  Show costs in
""";
//        String tonesMenu = """
//1.  Ringing tone
//2.  Ringing volume
//3.  Incoming call alert
//4.  Composer
//5.  Message alert tone
//6.  Keypad tones
//7.  Warning and game tones
//8.  Vibrating alert
//9.  Screen saver
//""";
        String callSettings = """
1. Automatic redial
2. Speed dialling
3. Call waiting options
4. Own number sending
5. Phone line in use
6. Automatic answer 1
""";
        String phoneSettings = """
1. Language
2. Cell info display
3. Welcome note
4. Network selection
5. Lights2
6. Confirm SIM service actions
""";

        String securitySettings = """
1. PIN code request
2. Call barring service
3. Fixed dialling
4. Closed user group
5. Phone security
6. Change access codes
""";

        System.out.println(mainMenu);
System.out.println("Select menu options: ");
int selected = input.nextInt();
switch (selected) {
        case 1:
            System.out.println(phoneBook);
            System.out.println("Select menu options: ");
            int phoneBookSelected = input.nextInt();
            switch (phoneBookSelected) {
                case 1:
                    System.out.println("Search...");
                    break;
                case 2:
                    System.out.println("Service Number...");
                    break;
                case 3:
                    System.out.println("Add Name...");
                    break;
                case 4:
                    System.out.println("Erase...");
                    break;
                case 5:
                    System.out.println("Edit...");
                    break;
                case 6:
                    System.out.println("Assign tone...");
                    break;
                case 7:
                    System.out.println("Send b'card...");
                    break;
                case 8:
                    System.out.println(phoneBookOption);
                    System.out.println("Select menu options: ");
                    int optionSelected = input.nextInt();
                    switch (optionSelected) {
                        case 1:
                            System.out.println("Type of view...");
                            break;
                        case 2:
                            System.out.println("Memory Status...");
                            break;
                        };
                    break;
                case 9:
                    System.out.println("Speed dials...");
                case 10:
                    System.out.println("Voice tags...");
        };
        break;
        case 2:
            System.out.println(messages);
            System.out.println("Select menu options: ");
            int optionSelected = input.nextInt();
            switch (optionSelected) {
            case 1:
                System.out.println("Send a message...");
                break;
            case 2:
                System.out.println("Inbox...");
                break;
            case 3:
                System.out.println("Outbox...");
                break;
            case 4:
                System.out.println("Pictue messages...");
                break;
            case 5:
                System.out.println("Templates...");
                break;
            case 6:
                System.out.println("Smileys...");
                break;
            case 7:
                System.out.println(messageSettingsOption); 
                System.out.println("Select menu options: ");
                int settingOptionSelected = input.nextInt();
                switch (settingOptionSelected) {
                case 1:
                    System.out.println(showCallDurationOption);
                    System.out.println("Select menu options: ");
                    int messageSettingOptionSelected = input.nextInt();
                    switch (messageSettingOptionSelected) {
                    case 1:
                        System.out.println("Message center number");
                        break;
                    case 2:
                        System.out.println("Message sent as");
                        break;
                    case 3:
                        System.out.println("Message validity");
                        break;
                    };
                    break;
                case 2:
                    System.out.println(commonSetting);
                    System.out.println("Select menu options: ");
                    int commonSettingOptionSelected = input.nextInt();
                    switch (commonSettingOptionSelected) {
                    case 1:
                        System.out.println("Delivery Report");
                        break;
                    case 2:
                        System.out.println("Reply via same center");
                        break;
                    case 3:
                        System.out.println("Character support");
                        break;
                    };
                    break;
                 };
            break;
            case 8:
                System.out.println("Info service...");
                break;
            case 9:
                System.out.println("Voice mailbox number...");
                break;
            case 10:
                System.out.println("Service command editor...");
                break;

            };
            break;
        case 3:
            System.out.println("Start chat");
        case 4:
            System.out.println(callRegister);
            System.out.println("Select menu options: ");
            int callRegisterOptionSelected = input.nextInt();
            switch (callRegisterOptionSelected) {
            case 1:
                System.out.println("Missed calls");
                break;
            case 2:
                System.out.println("Recieved calls");
                break;
            case 3:
                System.out.println("Dialled numbers");
                break;
            case 4:
                System.out.println("Erase recent call lists");
                break;
              
            
            case 5:
                System.out.println(callRegisterOption);
                System.out.println("Select menu options: ");
                int callDurationOptionSelected = input.nextInt();
                switch (callDurationOptionSelected) {
                case 1:
                    System.out.println(showCallDurationOption);
                    System.out.println("Select menu options: ");
                    int showCallDurationOptionSelected = input.nextInt();
                    switch (showCallDurationOptionSelected) {
                    case 1:
                        System.out.println("Last call duration");
                        break;
                    case 2:
                        System.out.println("All calls' duration");
                        break;
                    case 3:
                        System.out.println("Receive calls' duration");
                        break;
                    case 4:
                        System.out.println("Dialed calls' duration");
                        break;
                    case 5:
                        System.out.println("Clear timers");
                        break;
                        };
                      break;
                    };
                break;
            case 6:
                System.out.println(showCallCost);
                System.out.println("Select menu options: ");
                int callCostOptionSelected = input.nextInt();
                switch (callCostOptionSelected) {
                  case 1:
                      System.out.println("Last call cost");
                      break;
                  case 2:
                      System.out.println("All call's cost");
                      break;
                  case 3:
                      System.out.println("Clear counters");
                      break;
                    };
                break;
            case 7:
                System.out.println(callCostSetting);
                System.out.println("Select menu options: ");
                int callCostSettingSelected = input.nextInt();
                switch (callCostSettingSelected) {
                  case 1:
                      System.out.println("Call cost limit");
                      break;
                  case 2:
                      System.out.println("Show costs in");
                      break;
                    };
                break;
            case 8:
                System.out.println("Prepaid credit");
                break;
        };
        break;
        case 5:
            System.out.println(tones);
            System.out.println("Select menu options: ");
        case 6:
            System.out.println(settings);
            System.out.println("Select menu options: ");
        case 7:
            System.out.println("Call divert");
        case 8:
            System.out.println("Games");
        case 9:
            System.out.println("Calculator");
        case 10:
            System.out.println("Reminders");
        case 11:
            System.out.println(clockMenu);
            System.out.println("Select menu options: ");
        case 12:
            System.out.println("Profiles");
        case 13:
            System.out.println("SIM services");
            System.out.println("Select menu options: ");
           
        }
    }
}
