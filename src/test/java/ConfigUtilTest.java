import com.asking.common.util.ConfigUtil;

public class ConfigUtilTest {
	public static void main(String[] args) {
		System.out.println(ConfigUtil.getConfigKey("public.config", "consume.thread.size"));
	}
}
