package 대추;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerDAO {
    List<CustomerVO> list = new ArrayList<>();
    Connection conn = null; // db와 연결
    Statement stmt = null; // 통로
    PreparedStatement pstmt = null; // 통로 Statement의 자식이라 기능 더 많음
    ResultSet rs = null; // 연결된 결과
    Scanner sc = new Scanner(System.in);

    // ----------------------- 고객정보끌어오기 -----------------------------------------------------------------------
    public List<CustomerVO> CustomerSelect() throws SQLException { // 고객 정보 조회
        conn = Common.getConnection();
        stmt = conn.createStatement();
        String query = "SELECT * FROM CUSTOMER";
        rs = stmt.executeQuery(query);

        while (rs.next()) {
            int user_number = rs.getInt("USER_NUMBER");
            String user_id = rs.getString("USER_ID");
            String user_pw = rs.getString("USER_PW");
            String name = rs.getString("NAME");
            String rrn = rs.getString("RRN");
            int credit_score_n = rs.getInt("CREDIT_SCORE_N");
            int credit_score_k = rs.getInt("CREDIT_SCORE_K");
            String phone_num = rs.getString("PHONE_NUM");
            String email = rs.getString("EMAIL");
            String job = rs.getString("JOB");
            int income = rs.getInt("INCOME");
            String bank = rs.getString("BANK");
            int account = rs.getInt("ACCOUNT");

            CustomerVO vo = new CustomerVO(user_number, user_id, user_pw, name, rrn, credit_score_n, credit_score_k,
                    phone_num, email, job, income, bank, account);
            list.add(vo);
        }
        Common.close(rs);
        Common.close(stmt);
        Common.close(conn);
    } catch (Exception e) {
        e.printStackTrace();
    }
    return list;

    // ----------------------- 회원가입 -----------------------------------------------------------------------
    public void customerSignUp() {
        System.out.println("=".repeat(10) + " 회원 가입 " + "=".repeat(10));
        System.out.print("아이디 : ");
        String user_id = sc.next();
        System.out.print("비밀번호 : ");
        String user_pw = sc.next();
        System.out.print("고객 이름 : ");
        String name = sc.next();
        System.out.print("주민등록번호 : ");
        String rrn = sc.next();
        System.out.print("신용평점 nice : ");
        int credit_score_n = sc.nextInt();
        System.out.print("신용평점 kcb: ");
        int credit_score_k = sc.nextInt();
        System.out.print("전화번호 : ");
        String phone_num = sc.next();
        System.out.print("이메일 : ");
        String email = sc.next();
//?? 직업 숫자로 받아서 String으로 반환해야 하는지
        System.out.print("직업 : ");
        String job = sc.next();
        System.out.print("소득 : ");
        int income = sc.nextInt();
        System.out.print("은행명 : ");
        String bank = sc.next();
        System.out.print("계좌번호 : ");
        int account = sc.nextInt();
//?? 시퀀스 포함해야 하는지, 아예 제외하고 입력해야 하는지
        String query = "INSERT INTO CUSTOMER VALUES(USER_NUMBER.NEXTVAL,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            conn = Common.getConnection();
            pstmt = conn.prepareStatement(query);
            pstmt.setString(,user_id);
            pstmt.setString(,user_pw);
            pstmt.setString(,name);
            pstmt.setString(,rrn);
            pstmt.setInt(,credit_score_n);
            pstmt.setInt(,credit_score_k);
            pstmt.setString(,phone_num);
            pstmt.setString(,email);
            pstmt.setString(,job);
            pstmt.setInt(,income);
            pstmt.setString(,bank);
            pstmt.setInt(,account);
            pstmt.executeUpdate(); // update

        } catch (Exception ex) {
            e.printStackTrace();
        }
        Common.close(pstmt);
        Common.close(conn);
    }

    // ----------------------- 회원정보출력 -----------------------------------------------------------------------
    public void customerInfoPrint(List<CustomerVO> list) {
        System.out.print("=".repeat(10) + " 고객 정보 조회 " + "=".repeat(10));
        for(CustomerVO e : list) {
            System.out.println("아이디 : " + e.getUser_id() + " ");
            System.out.println("비밀번호 : " + e.getUser_pw() + " ");
            System.out.println("고객 이름 : " + e.getName() + " ");
            System.out.println("주민등록번호 : " + e.getRrn() + " ");
            System.out.println("신용평점 nice : " + e.getCredit_score_n() + " ");
            System.out.println("신용평점 kcb : " + e.getCredit_score_k() + " ");
            System.out.println("전화번호 : " + e.getPhone_num() + " ");
            System.out.println("이메일 : " + e.getEmail() + " ");
            System.out.println("직업 : " + e.getJob() + " ");
            System.out.println("소득 : " + e.getIncome() + " ");
            System.out.println("은행명 : " + e.getBank() + " ");
            System.out.println("계좌번호 : " + e.getAccount() + " ");
        }
        System.out.println("=".repeat(25));
    }

    // ----------------------- 로그인 -----------------------------------------------------------------------
    public void customerLogin() {
//?? 쿼리문 수정해야 할 듯
        String query = "SELECT USER_PW FROM CUSTOMER WHERE USER_ID = ?";
        try {
            conn = Common.getConnection();
            pstmt = conn.prepareStatement(query);

            System.out.print("=".repeat(10) + " 로그인 " + "=".repeat(10));
            System.out.print("아이디 : ");
            String user_id = sc.next();
            System.out.print("비밀번호 : ");
            String user_pw = sc.next();
            pstmt.setString(1, user_id);
            rs = pstmt.executeQuery();
            if (rs.next()) {
                if (rs.getString(1).equalsIgnoreCase(user_pw)) {
                    System.out.println("로그인 되었습니다.");
                } else {
                    System.out.println("아이디와 비밀번호를 다시 확인해주세요");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        Common.close(rs);
        Common.close(pstmt);
        Common.close(conn);
    }
}



