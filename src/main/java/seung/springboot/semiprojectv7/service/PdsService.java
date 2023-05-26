package seung.springboot.semiprojectv7.service;

import org.springframework.core.io.UrlResource;
import org.springframework.http.HttpHeaders;
import org.springframework.web.multipart.MultipartFile;
import seung.springboot.semiprojectv7.model.Pds;
import seung.springboot.semiprojectv7.model.PdsAttach;
import seung.springboot.semiprojectv7.model.PdsReply;

import java.util.List;
import java.util.Map;

public interface PdsService {

    Map<String, Object> newPds(Pds pds);

    boolean newPdsAttach(MultipartFile attach, Map<String, Object> pinfo);

    Map<String, Object> readPds(Integer cpg);

    Pds readOnePds(int pno);

    PdsAttach readOnePdsAttatch(int pno);

    HttpHeaders getHeader(String fname, String uuid);

    UrlResource getResoutce(String fname, String uuid);

    void downfile(int pno);

    List<String> readFtype();

    List<PdsReply> readPdsReply(int pno);

    boolean newReply(PdsReply reply);

    boolean newRreply(PdsReply reply);
}
