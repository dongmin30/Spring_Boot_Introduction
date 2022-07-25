package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.*;

/**
 * packageName    : hello.hellospring.repository
 * fileName       : MemberRepository
 * author         : dongm
 * date           : 2022-07-24
 * description    :
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2022-07-24        dongm       최초 생성
 */
public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id);
    Optional<Member> findByName(String name);
    List<Member> findAll();
}
