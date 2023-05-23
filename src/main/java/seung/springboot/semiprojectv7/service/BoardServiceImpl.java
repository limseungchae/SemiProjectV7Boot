package seung.springboot.semiprojectv7.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import seung.springboot.semiprojectv7.dao.BoardDAO;
import seung.springboot.semiprojectv7.model.Board;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service("bdsrv")
public class BoardServiceImpl implements BoardService{

    @Autowired private BoardDAO bddao;

    @Override
    public Map<String, Object> readBoard(int cpage) {
        // int stbno = (cpage - 1) * 25;
        //System.out.println(bddao.selectBoard(stbno).size());
        return bddao.selectBoard(cpage - 1);
    }

    @Override
    public Map<String, Object> readBoard(int cpage, String ftype, String fkey) {
        int stbno = (cpage - 1);

        // 처리시 사용할 데이터들을 해쉬맵에 담아서 보냄
        Map<String, Object> params = new HashMap<>();
        params.put("stbno", stbno);
        params.put("ftype", ftype);
        params.put("fkey", fkey);

        return (Map<String, Object>) bddao.selectBoard(params);
    }


    @Override
    public boolean newBoard(Board bd) {
        boolean result = false;

        if (bddao.insertBoard(bd) > 0) result = true;

        return result;
    }

    @Override
    public Board readOneBoard(int bno) {
        return bddao.selectOneBoard(bno);
    }
}
