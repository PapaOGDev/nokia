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
//        String callRegisterOption = """
//Call Register
//1.  Missed calls
//2.  Received calls
//3.  Dialled numbers
//4.  Erase recent call lists
//5.  Show call duration
//6.  Show call costs
//7.  Call cost settings
//8.  Prepaid credit
//""";
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
        case 1 -> {
            System.out.println(phoneBook);
            System.out.println("Select menu options: ");
            int phoneBookSelected = input.nextInt();
            switch (phoneBookSelected) {
                case 1 -> System.out.println("Search...");
                case 2 -> System.out.println("Service Number...");
                case 3 -> System.out.println("Add Name...");
                case 4 -> System.out.println("Erase...");
                case 5 -> System.out.println("Edit...");
                case 6 -> System.out.println("Assign tone...");
                case 7 -> System.out.println("Send b'card...");
                case 8 -> {
                    System.out.println(phoneBookOption);
                    System.out.println("Select menu options: ");
                    int optionSelected = input.nextInt();
                    switch (optionSelected) {
                        case 1 -> System.out.println("Type of view...");
                        case 2 -> System.out.println("Memory Status...");
                        };
                    }
                case 9 -> System.out.println("Speed dials...");
                case 10 -> System.out.println("Voice tags...");
                default -> System.out.println("Select a valid option");
            };
        }
        case 2 -> {
            System.out.println(messages);
            System.out.println("Select menu options: ");
            int optionSelected = input.nextInt();
            switch (optionSelected) {
            case 1 -> System.out.println("Send a message...");
            case 2 -> System.out.println("Inbox...");
            case 3 -> System.out.println("Outbox...");
            case 4 -> System.out.println("Pictue messages...");
            case 5 -> System.out.println("Templates...");
            case 6 -> System.out.println("Smileys...");
            case 7 -> {
                System.out.println(messageSettingsOption); 
                System.out.println("Select menu options: ");
                int settingOptionSelected = input.nextInt();
                switch (settingOptionSelected) {
                case 1 -> {
                    System.out.println(showCallDurationOption);
                    System.out.println("Select menu options: ");
                    int messageSettingOptionSelected = input.nextInt();
                    switch (messageSettingOptionSelected) {
                    case 1 -> System.out.println("Message center number");
                    case 2 -> System.out.println("Message sent as");
                    case 3 -> System.out.println("Message validity");
                    default -> System.out.println("Select a valid option");
                    };
                }
                case 2 -> {
                    System.out.println(commonSetting);
                    System.out.println("Select menu options: ");
                    int commonSettingOptionSelected = input.nextInt();
                    switch (commonSettingOptionSelected) {
                    case 1 -> System.out.println("Delivery Report");
                    case 2 -> System.out.println("Reply via same center");
                    case 3 -> System.out.println("Character support");
                    default -> System.out.println("Select a valid option");
                    };
                }
                 };
            }
            case 8 -> System.out.println("Info service...");
            case 9 -> System.out.println("Voice mailbox number...");
            case 10 -> System.out.println("Service command editor...");
            default -> System.out.println("Select a valid option");

            };
        }
        case 3 -> System.out.println("Start chat");
        case 4 -> {
            System.out.println(callRegister);
            System.out.println("Select menu options: ");
            int callRegisterOptionSelected = input.nextInt();
            switch (callRegisterOptionSelected) {
            case 1 -> System.out.println("Missed calls");
            case 2 -> System.out.println("Recieved calls");
            case 3 -> System.out.println("Dialled numbers");
            case 4 -> System.out.println("Erase recent call lists");
            case 5 -> {
                System.out.println(callRegister);
                System.out.println("Select menu options: ");
                int callDurationOptionSelected = input.nextInt();
                switch (callDurationOptionSelected) {
                    case 1 -> System.out.println("Last call duration");
                    case 2 -> System.out.println("All calls' duration");
                    case 3 -> System.out.println("Receive calls' duration");
                    case 4 -> System.out.println("Dialed calls' duration");
                    case 5 -> System.out.println("Clear timers");
                    default -> System.out.println("Select a valid option");
                        };
              }
            case 6 -> {
                System.out.println(showCallCost);
                System.out.println("Select menu options: ");
                int callCostOptionSelected = input.nextInt();
                switch (callCostOptionSelected) {
                  case 1 -> System.out.println("Last call cost");
                  case 2 -> System.out.println("All call's cost");
                  case 3 -> System.out.println("Clear counters");
                  default -> System.out.println("Select a valid option");
                    };
             }
            case 7 -> {
                System.out.println(callCostSetting);
                System.out.println("Select menu options: ");
                int callCostSettingSelected = input.nextInt();
                switch (callCostSettingSelected) {
                  case 1 -> System.out.println("Call cost limit");
                  case 2 -> System.out.println("Show costs in");
                  default -> System.out.println("Select a valid option");
                    };
              }
            case 8 -> System.out.println("Prepaid credit");
            default -> System.out.println("Select a valid option");

            }
        }
        case 5 -> {
            System.out.println(tones);
            System.out.println("Select menu options: ");
            int tonesSettingSelected = input.nextInt();
            switch (tonesSettingSelected) {
              case 1 -> System.out.println("Ringing tone");
              case 2 -> System.out.println("Ringing volume");
              case 3 -> System.out.println("Incoming call alert");
              case 4 -> System.out.println("Composer");
              case 5 -> System.out.println("Message alert tone");
              case 6 -> System.out.println("Keypad tones");
              case 7 -> System.out.println("Warning and game tones");
              case 8 -> System.out.println("Vibrating alert");
              case 9 -> System.out.println("Screen saver");
              default -> System.out.println("Select a valid option");
                };
        }
        case 6 -> {
            System.out.println(settings);
            System.out.println("Select menu options: ");
            int settingSelected = input.nextInt();
            switch (settingSelected) {
              case 1 -> {
                  System.out.println(callSettings);
                  System.out.println("Select menu options: ");
                  int callSettingSelected = input.nextInt();
                  switch (callSettingSelected) {
                    case 1 -> System.out.println("Automatic redial");
                    case 2 -> System.out.println("Speed dialling");
                    case 3 -> System.out.println("Call waiting options");
                    case 4 -> System.out.println("Own number sending");
                    case 5 -> System.out.println("Phone line in use");
                    case 6 -> System.out.println("Automatic answer");
                    default -> System.out.println("Select a valid option");
                    };
                }
              case 2 -> {
                  System.out.println(phoneSettings);
                  System.out.println("Select menu options: ");
                  int phoneSettingSelected = input.nextInt();
                  switch (phoneSettingSelected) {
                    case 1 -> System.out.println("Language");
                    case 2 -> System.out.println("Cell info display");
                    case 3 -> System.out.println("Welcome note");
                    case 4 -> System.out.println("Network selection");
                    case 5 -> System.out.println("Lights");
                    case 6 -> System.out.println("Confirm SIM service actions");
                    default -> System.out.println("Select a valid option");
                    };
                }
              case 3 -> {
                  System.out.println(securitySettings);
                  System.out.println("Select menu options: ");
                  int securitySettingSelected = input.nextInt();
                  switch (securitySettingSelected) {
                    case 1 -> System.out.println("PIN code request");
                    case 2 -> System.out.println("Call barring service");
                    case 3 -> System.out.println("Fixed dialling");
                    case 4 -> System.out.println("Closed user group");
                    case 5 -> System.out.println("Phone security");
                    case 6 -> System.out.println("Change access codes");
                    default -> System.out.println("Select a valid option");
                    };
                }
              case 4 -> System.out.println("Restore factory settings");
              default -> System.out.println("Select a valid option");
                };
            }
        case 7 -> System.out.println("Call divert");
        case 8 -> System.out.println("Games");
        case 9 -> System.out.println("Calculator");
        case 10 -> System.out.println("Reminders");
        case 11 -> {
            System.out.println(clockMenu);
            System.out.println("Select menu options: ");
                  int phoneSettingSelected = input.nextInt();
                  switch (phoneSettingSelected) {
                    case 1 -> System.out.println("Alarm Clock");
                    case 2 -> System.out.println("Clock settings");
                    case 3 -> System.out.println("Date setting");
                    case 4 -> System.out.println("Stopwatch");
                    case 5 -> System.out.println("Countdown timer");
                    case 6 -> System.out.println("Auto update of date and time");
                    default -> System.out.println("Select a valid option");
                    };
            }
        case 12 -> System.out.println("Profiles");
        case 13 -> System.out.println("SIM services");
        default -> System.out.println("Select a valid option");
           
        }
    }
}
