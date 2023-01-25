package algorithm.ex92334;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SolutionEx5 {
    public static void main(String args[]){
        String[] id_list=  {"muzi", "frodo", "apeach", "neo"}; // 이용자
        String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"}; // 각 이용자가 신고한 이용자ID
        int k = 2;

        SolutionEx5 s = new SolutionEx5();
        int []answer = s.solution(id_list, report, k);
        System.out.println(Arrays.toString(answer));
    }
    public int[] solution(String[] id_list, String[] report, int k){
        // 회원 목록 객체 생성 => 회원 리스트 담김 => 회원 객체로 리스트 만듦
        // 회원 객체 구성 => 회원시퀀스, 회원 ID 객체
        Users users = IntStream.range(0, id_list.length)
                .mapToObj(i -> new User(i, new UserId(id_list[i])))
                .collect(Collectors.collectingAndThen(Collectors.toList(), Users::new));

       /* for(User u : users.findSortAll()){
            System.out.println(u);
        }*/
        // 신고 목록 => 신고자, 신고당한 사람 분리 후 리스트로리턴
        Reports reports = Arrays.stream(report)
                .map(rawReport -> ReportParser.parse(users, rawReport))
                .collect(Collectors.collectingAndThen(Collectors.toList(), Reports::new));

        for(Report r : reports.getReports()){
            System.out.println(r);
        }

        return null;
    }
    private static class ReportParser{
        private static final String DELIMITER = " ";

        public static Report parse(Users users, String report){
            String[] splitted = report.split(DELIMITER);
            User reporter = users.findUser(new UserId(splitted[0])); // 신고자
            User reported = users.findUser(new UserId(splitted[1])); // 신고당한회원

            return new Report(reporter, reported);
        }
    }
    private static class Reports {
        private final List<Report> reports;

        public Reports(List<Report> reports){
            this.reports = reports;
        }

        public List<Report> getReports(){
            return reports;
        }
    }
    private static class Report {
        private final User reporter;
        private final User reported;

        public Report(User reporter, User reported) {
            this.reporter = reporter;
            this.reported = reported;
        }

        @Override
        public String toString() {
            return "Report{" +
                    "reporter=" + reporter +
                    ", reported=" + reported +
                    '}';
        }
    }
    private static class Users{ // 회원 리스트
        private final List<User> users;

        public  Users(List<User> users){
            this.users = users;
        }
        public User findUser(UserId userId){
            return users.stream()
                    .filter(user -> user.getUserId().equals(userId))
                    .peek(System.out::println)
                    .findAny()
                    .orElseThrow(() -> new IllegalArgumentException("User Not Found id : "+userId));
        }
        public List<User> findSortAll(){
            return users.stream()
                    .sorted()
                    .collect(Collectors.toList());
        }
    }
    private static class User implements Comparable<User>{
        Integer sequence;
        UserId userId;

        public User(Integer sequence, UserId userId) {
            this.sequence = sequence;
            this.userId = userId;
        }
        public UserId getUserId() {
            return userId;
        }

        @Override
        public String toString() {
            return "User{" +
                    "sequence=" + sequence +
                    ", userId=" + userId +
                    '}';
        }

        @Override
        public int compareTo(User other) {
            return this.sequence.compareTo(other.sequence);
        }            // 자기자신과    매개변수 객체를 비교 하는것.



        @Override
        public int hashCode() {
            return super.hashCode();
        }

        @Override
        public boolean equals(Object o) {
            if(this == o) return true;
            if(o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return Objects.equals(userId, user.userId);
        }
    }
    private static class UserId {
        String id;
        public UserId(String id) {
            this.id = id;
        }

        @Override
        public String toString() {
            return "UserId{" +
                    "id='" + id + '\'' +
                    '}';
        }
    }
}

