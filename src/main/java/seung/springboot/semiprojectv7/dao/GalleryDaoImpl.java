package seung.springboot.semiprojectv7.dao;

import org.springframework.stereotype.Repository;
import seung.springboot.semiprojectv7.model.GalAttach;
import seung.springboot.semiprojectv7.model.Gallery;

@Repository("galdao")
public class GalleryDaoImpl implements GalleryDao{

    @Override
    public int insertGal(Gallery gallery) {
        return 0;
    }

    @Override
    public int insertGalAttach(GalAttach ga) {
        return 0;
    }
}
