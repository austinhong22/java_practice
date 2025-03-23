import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        
        while (!exit) {
            // 메뉴 출력
            System.out.println("\n===== 문자열 조작 프로그램 =====");
            System.out.println("1. 문자열 길이 계산");
            System.out.println("2. 대문자 변환");
            System.out.println("3. 소문자 변환");
            System.out.println("4. 부분 문자열 추출");
            System.out.println("5. 특정 단어 검색 및 치환");
            System.out.println("0. 종료");
            System.out.print("원하는 기능의 번호를 입력하세요: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // 개행 문자 제거
            
            if (choice == 0) {
                exit = true;
                System.out.println("프로그램을 종료합니다.");
                continue;
            }
            
            // 모든 경우에 문자열 입력 받기
            System.out.print("문자열을 입력하세요: ");
            String input = scanner.nextLine();
            
            switch (choice) {
                case 1:
                    System.out.println("문자열 길이: " + StringProcessor.getLength(input));
                    break;
                case 2:
                    System.out.println("대문자 변환 결과: " + StringProcessor.toUpperCase(input));
                    break;
                case 3:
                    System.out.println("소문자 변환 결과: " + StringProcessor.toLowerCase(input));
                    break;
                case 4:
                    System.out.print("시작 인덱스: ");
                    int start = scanner.nextInt();
                    System.out.print("종료 인덱스: ");
                    int end = scanner.nextInt();
                    scanner.nextLine(); // 개행 제거
                    System.out.println("부분 문자열: " + StringProcessor.getSubstring(input, start, end));
                    break;
                case 5:
                    System.out.print("검색할 단어: ");
                    String target = scanner.nextLine();
                    System.out.print("치환할 단어: ");
                    String replacement = scanner.nextLine();
                    System.out.println("치환 결과: " + StringProcessor.replaceWord(input, target, replacement));
                    break;
                default:
                    System.out.println("올바른 번호를 선택하세요.");
                    break;
            }
        }
        
        scanner.close();
    }
}