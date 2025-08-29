package Head18_DependencyInjection.example01_Using_Extends;

import java.util.List;

public class MenuService {
    public List<String> getMenuList() {
        return List.of("아메리카노", "카페라떼");
    }
}