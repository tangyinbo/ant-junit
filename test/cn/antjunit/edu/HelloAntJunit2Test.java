package cn.antjunit.edu;
import org.junit.Test;
import static org.junit.Assert.*;
public class HelloAntJunit2Test {
	@Test
	public void testAdd(){
		assertEquals("加法测试失败", 2,2);
	}
	
}
