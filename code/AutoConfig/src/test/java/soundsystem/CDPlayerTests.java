package soundsystem;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTests {

@Rule
public final SystemOutRule log = new SystemOutRule().enableLog();

@Autowired
private MediaPlayer player;

@Autowired
private CompactDisc cd;

@Test
public void cdShouldNotBeNull() {
  assertNotNull(cd);
}

@Test
public void play() {
  player.play();
 // System.out.println(log.getLog());
  assertEquals(
      "Playing Sgt. Pepper's Lonely Hearts Club Band by The Beatles", 
      log.getLog());

}

}
