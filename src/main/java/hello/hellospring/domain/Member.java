package hello.hellospring.domain;

import lombok.Data;

/**
 * packageName    : hello.hellospring.domain
 * fileName       : Member
 * author         : dongm
 * date           : 2022-07-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-07-24        dongm       최초 생성
 */
@Data
public class Member {
    private Long id;
    private String name;
}
