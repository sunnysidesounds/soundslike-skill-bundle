package api;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import soundslike.SoundsLikeFreeSoundClient;

import java.io.File;
import java.net.URL;

public class SoundsLikeFreeSoundClientTest {

	SoundsLikeFreeSoundClient soundsClient = null;


	@Before
	public void setup() {
		soundsClient = new SoundsLikeFreeSoundClient();
	}


	/**
	 * Test whether there is a ,mp3 in the url that is return from freesounds.org
	 */
	@Test
	public void testMp3InSoundUrl() {
		String url = soundsClient.getSound("cat");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Should contains .mp3 extension in the url", contains);
	}

	@Test
	public void testHttpsInSoundUrl() {
		String url = soundsClient.getSound("dog");
		boolean contains = url.contains("https");
		Assert.assertTrue("Should contains https in the url", contains);

	}

	@Test
	public void testPhrasesResourceDirectory(){
		ClassLoader classLoader = SoundsLikeFreeSoundClient.class.getClassLoader();
		URL resource = classLoader.getResource("phrases");
		boolean isTrue = false;
		if(resource != null){
			isTrue = true;
		}
		Assert.assertTrue("phrase folder should exist in resource directory", isTrue);
	}


	/*
	// These are all of the slot tests 528 of them. Don't run all at once or the API will timeout due to threshold.

	@Test
	public void aardvarkTest() {
		String url = soundsClient.getSound("aardvark");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have aardvark", contains);
	}
	@Test
	public void aardwolfTest() {
		String url = soundsClient.getSound("aardwolf");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have aardwolf", contains);
	}
	@Test
	public void africanbuffaloTest() {
		String url = soundsClient.getSound("african buffalo");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have african buffalo", contains);
	}
	@Test
	public void africanelephantTest() {
		String url = soundsClient.getSound("african elephant");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have african elephant", contains);
	}
	@Test
	public void africanleopardTest() {
		String url = soundsClient.getSound("african leopard");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have african leopard", contains);
	}
	@Test
	public void albatrossTest() {
		String url = soundsClient.getSound("albatross");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have albatross", contains);
	}
	@Test
	public void alligatorTest() {
		String url = soundsClient.getSound("alligator");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have alligator", contains);
	}
	@Test
	public void alpacaTest() {
		String url = soundsClient.getSound("alpaca");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have alpaca", contains);
	}
	@Test
	public void americanbuffaloTest() {
		String url = soundsClient.getSound("american buffalo");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have american buffalo", contains);
	}
	@Test
	public void americanrobinTest() {
		String url = soundsClient.getSound("american robin");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have american robin", contains);
	}
	@Test
	public void amphibianTest() {
		String url = soundsClient.getSound("amphibian");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have amphibian", contains);
	}
	@Test
	public void anacondaTest() {
		String url = soundsClient.getSound("anaconda");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have anaconda", contains);
	}
	@Test
	public void angelfishTest() {
		String url = soundsClient.getSound("angelfish");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have angelfish", contains);
	}
	@Test
	public void anglerfishTest() {
		String url = soundsClient.getSound("anglerfish");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have anglerfish", contains);
	}
	@Test
	public void antTest() {
		String url = soundsClient.getSound("ant");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have ant", contains);
	}
	@Test
	public void anteaterTest() {
		String url = soundsClient.getSound("anteater");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have anteater", contains);
	}
	@Test
	public void antelopeTest() {
		String url = soundsClient.getSound("antelope");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have antelope", contains);
	}
	@Test
	public void antlionTest() {
		String url = soundsClient.getSound("antlion");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have antlion", contains);
	}
	@Test
	public void apeTest() {
		String url = soundsClient.getSound("ape");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have ape", contains);
	}
	@Test
	public void aphidTest() {
		String url = soundsClient.getSound("aphid");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have aphid", contains);
	}
	@Test
	public void arabianleopardTest() {
		String url = soundsClient.getSound("arabian leopard");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have arabian leopard", contains);
	}
	@Test
	public void arcticFoxTest() {
		String url = soundsClient.getSound("arctic Fox");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have arctic Fox", contains);
	}
	@Test
	public void arcticWolfTest() {
		String url = soundsClient.getSound("arctic Wolf");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have arctic Wolf", contains);
	}
	@Test
	public void armadilloTest() {
		String url = soundsClient.getSound("armadillo");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have armadillo", contains);
	}
	@Test
	public void arrowcrabTest() {
		String url = soundsClient.getSound("arrow crab");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have arrow crab", contains);
	}
	@Test
	public void aspTest() {
		String url = soundsClient.getSound("asp");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have asp", contains);
	}
	@Test
	public void assTest() {
		String url = soundsClient.getSound("ass");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have ass", contains);
	}
	@Test
	public void baboonTest() {
		String url = soundsClient.getSound("baboon");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have baboon", contains);
	}
	@Test
	public void badgerTest() {
		String url = soundsClient.getSound("badger");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have badger", contains);
	}
	@Test
	public void baldeagleTest() {
		String url = soundsClient.getSound("bald eagle");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have bald eagle", contains);
	}
	@Test
	public void bandicootTest() {
		String url = soundsClient.getSound("bandicoot");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have bandicoot", contains);
	}
	@Test
	public void barnacleTest() {
		String url = soundsClient.getSound("barnacle");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have barnacle", contains);
	}
	@Test
	public void barracudaTest() {
		String url = soundsClient.getSound("barracuda");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have barracuda", contains);
	}
	@Test
	public void basiliskTest() {
		String url = soundsClient.getSound("basilisk");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have basilisk", contains);
	}
	@Test
	public void bassTest() {
		String url = soundsClient.getSound("bass");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have bass", contains);
	}
	@Test
	public void batTest() {
		String url = soundsClient.getSound("bat");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have bat", contains);
	}
	@Test
	public void beakedwhaleTest() {
		String url = soundsClient.getSound("beaked whale");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have beaked whale", contains);
	}
	@Test
	public void bearTest() {
		String url = soundsClient.getSound("bear");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have bear", contains);
	}
	@Test
	public void beaverTest() {
		String url = soundsClient.getSound("beaver");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have beaver", contains);
	}
	@Test
	public void bedbugTest() {
		String url = soundsClient.getSound("bedbug");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have bedbug", contains);
	}
	@Test
	public void beeTest() {
		String url = soundsClient.getSound("bee");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have bee", contains);
	}
	@Test
	public void beetleTest() {
		String url = soundsClient.getSound("beetle");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have beetle", contains);
	}
	@Test
	public void birdTest() {
		String url = soundsClient.getSound("bird");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have bird", contains);
	}
	@Test
	public void bisonTest() {
		String url = soundsClient.getSound("bison");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have bison", contains);
	}
	@Test
	public void blackbirdTest() {
		String url = soundsClient.getSound("blackbird");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have blackbird", contains);
	}
	@Test
	public void blackpantherTest() {
		String url = soundsClient.getSound("black panther");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have black panther", contains);
	}
	@Test
	public void blackwidowspiderTest() {
		String url = soundsClient.getSound("black widow spider");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have black widow spider", contains);
	}
	@Test
	public void bluebirdTest() {
		String url = soundsClient.getSound("blue bird");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have blue bird", contains);
	}
	@Test
	public void bluejayTest() {
		String url = soundsClient.getSound("blue jay");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have blue jay", contains);
	}
	@Test
	public void bluewhaleTest() {
		String url = soundsClient.getSound("blue whale");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have blue whale", contains);
	}
	@Test
	public void boaTest() {
		String url = soundsClient.getSound("boa");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have boa", contains);
	}
	@Test
	public void boarTest() {
		String url = soundsClient.getSound("boar");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have boar", contains);
	}
	@Test
	public void bobcatTest() {
		String url = soundsClient.getSound("bobcat");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have bobcat", contains);
	}
	@Test
	public void bobolinkTest() {
		String url = soundsClient.getSound("bobolink");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have bobolink", contains);
	}
	@Test
	public void bonoboTest() {
		String url = soundsClient.getSound("bonobo");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have bonobo", contains);
	}
	@Test
	public void boobyTest() {
		String url = soundsClient.getSound("booby");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have booby", contains);
	}
	@Test
	public void boxjellyfishTest() {
		String url = soundsClient.getSound("box jellyfish");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have box jellyfish", contains);
	}
	@Test
	public void bovidTest() {
		String url = soundsClient.getSound("bovid");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have bovid", contains);
	}
	@Test
	public void buffaloTest() {
		String url = soundsClient.getSound("buffalo");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have buffalo", contains);
	}
	@Test
	public void bugTest() {
		String url = soundsClient.getSound("bug");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have bug", contains);
	}
	@Test
	public void butterflyTest() {
		String url = soundsClient.getSound("butterfly");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have butterfly", contains);
	}
	@Test
	public void buzzardTest() {
		String url = soundsClient.getSound("buzzard");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have buzzard", contains);
	}
	@Test
	public void camelTest() {
		String url = soundsClient.getSound("camel");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have camel", contains);
	}
	@Test
	public void canidTest() {
		String url = soundsClient.getSound("canid");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have canid", contains);
	}
	@Test
	public void capebuffaloTest() {
		String url = soundsClient.getSound("cape buffalo");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have cape buffalo", contains);
	}
	@Test
	public void capybaraTest() {
		String url = soundsClient.getSound("capybara");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have capybara", contains);
	}
	@Test
	public void cardinalTest() {
		String url = soundsClient.getSound("cardinal");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have cardinal", contains);
	}
	@Test
	public void caribouTest() {
		String url = soundsClient.getSound("caribou");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have caribou", contains);
	}
	@Test
	public void carpTest() {
		String url = soundsClient.getSound("carp");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have carp", contains);
	}
	@Test
	public void catTest() {
		String url = soundsClient.getSound("cat");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have cat", contains);
	}
	@Test
	public void catsharkTest() {
		String url = soundsClient.getSound("catshark");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have catshark", contains);
	}
	@Test
	public void caterpillarTest() {
		String url = soundsClient.getSound("caterpillar");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have caterpillar", contains);
	}
	@Test
	public void catfishTest() {
		String url = soundsClient.getSound("catfish");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have catfish", contains);
	}
	@Test
	public void cattleTest() {
		String url = soundsClient.getSound("cattle");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have cattle", contains);
	}
	@Test
	public void centipedeTest() {
		String url = soundsClient.getSound("centipede");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have centipede", contains);
	}
	@Test
	public void cephalopodTest() {
		String url = soundsClient.getSound("cephalopod");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have cephalopod", contains);
	}
	@Test
	public void chameleonTest() {
		String url = soundsClient.getSound("chameleon");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have chameleon", contains);
	}
	@Test
	public void cheetahTest() {
		String url = soundsClient.getSound("cheetah");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have cheetah", contains);
	}
	@Test
	public void chickadeeTest() {
		String url = soundsClient.getSound("chickadee");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have chickadee", contains);
	}
	@Test
	public void chickenTest() {
		String url = soundsClient.getSound("chicken");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have chicken", contains);
	}
	@Test
	public void chimpanzeeTest() {
		String url = soundsClient.getSound("chimpanzee");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have chimpanzee", contains);
	}
	@Test
	public void chinchillaTest() {
		String url = soundsClient.getSound("chinchilla");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have chinchilla", contains);
	}
	@Test
	public void chipmunkTest() {
		String url = soundsClient.getSound("chipmunk");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have chipmunk", contains);
	}
	@Test
	public void clamTest() {
		String url = soundsClient.getSound("clam");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have clam", contains);
	}
	@Test
	public void clownfishTest() {
		String url = soundsClient.getSound("clownfish");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have clownfish", contains);
	}
	@Test
	public void cobraTest() {
		String url = soundsClient.getSound("cobra");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have cobra", contains);
	}
	@Test
	public void cockroachTest() {
		String url = soundsClient.getSound("cockroach");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have cockroach", contains);
	}
	@Test
	public void codTest() {
		String url = soundsClient.getSound("cod");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have cod", contains);
	}
	@Test
	public void condorTest() {
		String url = soundsClient.getSound("condor");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have condor", contains);
	}
	@Test
	public void constrictorTest() {
		String url = soundsClient.getSound("constrictor");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have constrictor", contains);
	}
	@Test
	public void coralTest() {
		String url = soundsClient.getSound("coral");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have coral", contains);
	}
	@Test
	public void cougarTest() {
		String url = soundsClient.getSound("cougar");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have cougar", contains);
	}
	@Test
	public void cowTest() {
		String url = soundsClient.getSound("cow");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have cow", contains);
	}
	@Test
	public void coyoteTest() {
		String url = soundsClient.getSound("coyote");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have coyote", contains);
	}
	@Test
	public void crabTest() {
		String url = soundsClient.getSound("crab");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have crab", contains);
	}
	@Test
	public void craneTest() {
		String url = soundsClient.getSound("crane");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have crane", contains);
	}
	@Test
	public void craneflyTest() {
		String url = soundsClient.getSound("crane fly");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have crane fly", contains);
	}
	@Test
	public void crawdadTest() {
		String url = soundsClient.getSound("crawdad");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have crawdad", contains);
	}
	@Test
	public void crayfishTest() {
		String url = soundsClient.getSound("crayfish");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have crayfish", contains);
	}
	@Test
	public void cricketTest() {
		String url = soundsClient.getSound("cricket");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have cricket", contains);
	}
	@Test
	public void crocodileTest() {
		String url = soundsClient.getSound("crocodile");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have crocodile", contains);
	}
	@Test
	public void crowTest() {
		String url = soundsClient.getSound("crow");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have crow", contains);
	}
	@Test
	public void cuckooTest() {
		String url = soundsClient.getSound("cuckoo");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have cuckoo", contains);
	}
	@Test
	public void cicadaTest() {
		String url = soundsClient.getSound("cicada");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have cicada", contains);
	}
	@Test
	public void damselflyTest() {
		String url = soundsClient.getSound("damselfly");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have damselfly", contains);
	}
	@Test
	public void deerTest() {
		String url = soundsClient.getSound("deer");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have deer", contains);
	}
	@Test
	public void dingoTest() {
		String url = soundsClient.getSound("dingo");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have dingo", contains);
	}
	@Test
	public void dinosaurTest() {
		String url = soundsClient.getSound("dinosaur");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have dinosaur", contains);
	}
	@Test
	public void dogTest() {
		String url = soundsClient.getSound("dog");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have dog", contains);
	}
	@Test
	public void dolphinTest() {
		String url = soundsClient.getSound("dolphin");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have dolphin", contains);
	}
	@Test
	public void donkeyTest() {
		String url = soundsClient.getSound("donkey");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have donkey", contains);
	}
	@Test
	public void dormouseTest() {
		String url = soundsClient.getSound("dormouse");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have dormouse", contains);
	}
	@Test
	public void doveTest() {
		String url = soundsClient.getSound("dove");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have dove", contains);
	}
	@Test
	public void dragonflyTest() {
		String url = soundsClient.getSound("dragonfly");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have dragonfly", contains);
	}
	@Test
	public void dragonTest() {
		String url = soundsClient.getSound("dragon");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have dragon", contains);
	}
	@Test
	public void duckTest() {
		String url = soundsClient.getSound("duck");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have duck", contains);
	}
	@Test
	public void dungbeetleTest() {
		String url = soundsClient.getSound("dung beetle");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have dung beetle", contains);
	}
	@Test
	public void eagleTest() {
		String url = soundsClient.getSound("eagle");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have eagle", contains);
	}
	@Test
	public void earthwormTest() {
		String url = soundsClient.getSound("earthworm");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have earthworm", contains);
	}
	@Test
	public void earwigTest() {
		String url = soundsClient.getSound("earwig");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have earwig", contains);
	}
	@Test
	public void echidnaTest() {
		String url = soundsClient.getSound("echidna");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have echidna", contains);
	}
	@Test
	public void eelTest() {
		String url = soundsClient.getSound("eel");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have eel", contains);
	}
	@Test
	public void egretTest() {
		String url = soundsClient.getSound("egret");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have egret", contains);
	}
	@Test
	public void elephantTest() {
		String url = soundsClient.getSound("elephant");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have elephant", contains);
	}
	@Test
	public void elephantsealTest() {
		String url = soundsClient.getSound("elephant seal");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have elephant seal", contains);
	}
	@Test
	public void elkTest() {
		String url = soundsClient.getSound("elk");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have elk", contains);
	}
	@Test
	public void emuTest() {
		String url = soundsClient.getSound("emu");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have emu", contains);
	}
	@Test
	public void englishpointerTest() {
		String url = soundsClient.getSound("english pointer");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have english pointer", contains);
	}
	@Test
	public void ermineTest() {
		String url = soundsClient.getSound("ermine");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have ermine", contains);
	}
	@Test
	public void falconTest() {
		String url = soundsClient.getSound("falcon");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have falcon", contains);
	}
	@Test
	public void ferretTest() {
		String url = soundsClient.getSound("ferret");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have ferret", contains);
	}
	@Test
	public void finchTest() {
		String url = soundsClient.getSound("finch");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have finch", contains);
	}
	@Test
	public void fireflyTest() {
		String url = soundsClient.getSound("firefly");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have firefly", contains);
	}
	@Test
	public void fishTest() {
		String url = soundsClient.getSound("fish");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have fish", contains);
	}
	@Test
	public void flamingoTest() {
		String url = soundsClient.getSound("flamingo");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have flamingo", contains);
	}
	@Test
	public void fleaTest() {
		String url = soundsClient.getSound("flea");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have flea", contains);
	}
	@Test
	public void flyTest() {
		String url = soundsClient.getSound("fly");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have fly", contains);
	}
	@Test
	public void flyingfishTest() {
		String url = soundsClient.getSound("flyingfish");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have flyingfish", contains);
	}
	@Test
	public void fowlTest() {
		String url = soundsClient.getSound("fowl");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have fowl", contains);
	}
	@Test
	public void foxTest() {
		String url = soundsClient.getSound("fox");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have fox", contains);
	}
	@Test
	public void frogTest() {
		String url = soundsClient.getSound("frog");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have frog", contains);
	}
	@Test
	public void fruitbatTest() {
		String url = soundsClient.getSound("fruit bat");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have fruit bat", contains);
	}
	@Test
	public void gamefowlTest() {
		String url = soundsClient.getSound("gamefowl");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have gamefowl", contains);
	}
	@Test
	public void galliformTest() {
		String url = soundsClient.getSound("galliform");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have galliform", contains);
	}
	@Test
	public void gazelleTest() {
		String url = soundsClient.getSound("gazelle");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have gazelle", contains);
	}
	@Test
	public void geckoTest() {
		String url = soundsClient.getSound("gecko");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have gecko", contains);
	}
	@Test
	public void gerbilTest() {
		String url = soundsClient.getSound("gerbil");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have gerbil", contains);
	}
	@Test
	public void giantpandaTest() {
		String url = soundsClient.getSound("giant panda");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have giant panda", contains);
	}
	@Test
	public void giantsquidTest() {
		String url = soundsClient.getSound("giant squid");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have giant squid", contains);
	}
	@Test
	public void gibbonTest() {
		String url = soundsClient.getSound("gibbon");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have gibbon", contains);
	}
	@Test
	public void gilamonsterTest() {
		String url = soundsClient.getSound("gila monster");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have gila monster", contains);
	}
	@Test
	public void giraffeTest() {
		String url = soundsClient.getSound("giraffe");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have giraffe", contains);
	}
	@Test
	public void goatTest() {
		String url = soundsClient.getSound("goat");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have goat", contains);
	}
	@Test
	public void goldfishTest() {
		String url = soundsClient.getSound("goldfish");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have goldfish", contains);
	}
	@Test
	public void gooseTest() {
		String url = soundsClient.getSound("goose");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have goose", contains);
	}
	@Test
	public void gopherTest() {
		String url = soundsClient.getSound("gopher");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have gopher", contains);
	}
	@Test
	public void gorillaTest() {
		String url = soundsClient.getSound("gorilla");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have gorilla", contains);
	}
	@Test
	public void grasshopperTest() {
		String url = soundsClient.getSound("grasshopper");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have grasshopper", contains);
	}
	@Test
	public void greatblueheronTest() {
		String url = soundsClient.getSound("great blue heron");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have great blue heron", contains);
	}
	@Test
	public void greatwhitesharkTest() {
		String url = soundsClient.getSound("great white shark");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have great white shark", contains);
	}
	@Test
	public void grizzlybearTest() {
		String url = soundsClient.getSound("grizzly bear");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have grizzly bear", contains);
	}
	@Test
	public void groundsharkTest() {
		String url = soundsClient.getSound("ground shark");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have ground shark", contains);
	}
	@Test
	public void groundslothTest() {
		String url = soundsClient.getSound("ground sloth");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have ground sloth", contains);
	}
	@Test
	public void grouseTest() {
		String url = soundsClient.getSound("grouse");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have grouse", contains);
	}
	@Test
	public void guanTest() {
		String url = soundsClient.getSound("guan");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have guan", contains);
	}
	@Test
	public void guanacoTest() {
		String url = soundsClient.getSound("guanaco");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have guanaco", contains);
	}
	@Test
	public void guineafowlTest() {
		String url = soundsClient.getSound("guineafowl");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have guineafowl", contains);
	}
	@Test
	public void guineapigTest() {
		String url = soundsClient.getSound("guinea pig");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have guinea pig", contains);
	}
	@Test
	public void gullTest() {
		String url = soundsClient.getSound("gull");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have gull", contains);
	}
	@Test
	public void guppyTest() {
		String url = soundsClient.getSound("guppy");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have guppy", contains);
	}
	@Test
	public void haddockTest() {
		String url = soundsClient.getSound("haddock");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have haddock", contains);
	}
	@Test
	public void halibutTest() {
		String url = soundsClient.getSound("halibut");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have halibut", contains);
	}
	@Test
	public void hammerheadsharkTest() {
		String url = soundsClient.getSound("hammerhead shark");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have hammerhead shark", contains);
	}
	@Test
	public void hamsterTest() {
		String url = soundsClient.getSound("hamster");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have hamster", contains);
	}
	@Test
	public void hareTest() {
		String url = soundsClient.getSound("hare");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have hare", contains);
	}
	@Test
	public void harrierTest() {
		String url = soundsClient.getSound("harrier");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have harrier", contains);
	}
	@Test
	public void hawkTest() {
		String url = soundsClient.getSound("hawk");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have hawk", contains);
	}
	@Test
	public void hedgehogTest() {
		String url = soundsClient.getSound("hedgehog");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have hedgehog", contains);
	}
	@Test
	public void hermitcrabTest() {
		String url = soundsClient.getSound("hermit crab");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have hermit crab", contains);
	}
	@Test
	public void heronTest() {
		String url = soundsClient.getSound("heron");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have heron", contains);
	}
	@Test
	public void herringTest() {
		String url = soundsClient.getSound("herring");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have herring", contains);
	}
	@Test
	public void hippopotamusTest() {
		String url = soundsClient.getSound("hippopotamus");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have hippopotamus", contains);
	}
	@Test
	public void hookwormTest() {
		String url = soundsClient.getSound("hookworm");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have hookworm", contains);
	}
	@Test
	public void hornetTest() {
		String url = soundsClient.getSound("hornet");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have hornet", contains);
	}
	@Test
	public void horseTest() {
		String url = soundsClient.getSound("horse");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have horse", contains);
	}
	@Test
	public void hoverflyTest() {
		String url = soundsClient.getSound("hoverfly");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have hoverfly", contains);
	}
	@Test
	public void hummingbirdTest() {
		String url = soundsClient.getSound("hummingbird");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have hummingbird", contains);
	}
	@Test
	public void humpbackwhaleTest() {
		String url = soundsClient.getSound("humpback whale");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have humpback whale", contains);
	}
	@Test
	public void hyenaTest() {
		String url = soundsClient.getSound("hyena");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have hyena", contains);
	}
	@Test
	public void guanaTest() {
		String url = soundsClient.getSound("guana");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have guana", contains);
	}
	@Test
	public void mpalaTest() {
		String url = soundsClient.getSound("mpala");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have mpala", contains);
	}
	@Test
	public void irukandjijellyfishTest() {
		String url = soundsClient.getSound("irukandji jellyfish");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have irukandji jellyfish", contains);
	}
	@Test
	public void jackalTest() {
		String url = soundsClient.getSound("jackal");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have jackal", contains);
	}
	@Test
	public void jaguarTest() {
		String url = soundsClient.getSound("jaguar");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have jaguar", contains);
	}
	@Test
	public void jayTest() {
		String url = soundsClient.getSound("jay");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have jay", contains);
	}
	@Test
	public void jellyfishTest() {
		String url = soundsClient.getSound("jellyfish");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have jellyfish", contains);
	}
	@Test
	public void junglefowlTest() {
		String url = soundsClient.getSound("junglefowl");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have junglefowl", contains);
	}
	@Test
	public void jacanaTest() {
		String url = soundsClient.getSound("jacana");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have jacana", contains);
	}
	@Test
	public void kangarooTest() {
		String url = soundsClient.getSound("kangaroo");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have kangaroo", contains);
	}
	@Test
	public void kangaroomouseTest() {
		String url = soundsClient.getSound("kangaroo mouse");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have kangaroo mouse", contains);
	}
	@Test
	public void kangarooratTest() {
		String url = soundsClient.getSound("kangaroo rat");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have kangaroo rat", contains);
	}
	@Test
	public void kingfisherTest() {
		String url = soundsClient.getSound("kingfisher");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have kingfisher", contains);
	}
	@Test
	public void kiteTest() {
		String url = soundsClient.getSound("kite");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have kite", contains);
	}
	@Test
	public void kiwiTest() {
		String url = soundsClient.getSound("kiwi");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have kiwi", contains);
	}
	@Test
	public void koalaTest() {
		String url = soundsClient.getSound("koala");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have koala", contains);
	}
	@Test
	public void koiTest() {
		String url = soundsClient.getSound("koi");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have koi", contains);
	}
	@Test
	public void komododragonTest() {
		String url = soundsClient.getSound("komodo dragon");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have komodo dragon", contains);
	}
	@Test
	public void krillTest() {
		String url = soundsClient.getSound("krill");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have krill", contains);
	}
	@Test
	public void ladybugTest() {
		String url = soundsClient.getSound("ladybug");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have ladybug", contains);
	}
	@Test
	public void lampreyTest() {
		String url = soundsClient.getSound("lamprey");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have lamprey", contains);
	}
	@Test
	public void landfowlTest() {
		String url = soundsClient.getSound("landfowl");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have landfowl", contains);
	}
	@Test
	public void landsnailTest() {
		String url = soundsClient.getSound("land snail");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have land snail", contains);
	}
	@Test
	public void larkTest() {
		String url = soundsClient.getSound("lark");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have lark", contains);
	}
	@Test
	public void leechTest() {
		String url = soundsClient.getSound("leech");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have leech", contains);
	}
	@Test
	public void lemmingTest() {
		String url = soundsClient.getSound("lemming");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have lemming", contains);
	}
	@Test
	public void lemurTest() {
		String url = soundsClient.getSound("lemur");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have lemur", contains);
	}
	@Test
	public void leopardTest() {
		String url = soundsClient.getSound("leopard");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have leopard", contains);
	}
	@Test
	public void leoponTest() {
		String url = soundsClient.getSound("leopon");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have leopon", contains);
	}
	@Test
	public void limpetTest() {
		String url = soundsClient.getSound("limpet");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have limpet", contains);
	}
	@Test
	public void lionTest() {
		String url = soundsClient.getSound("lion");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have lion", contains);
	}
	@Test
	public void lizardTest() {
		String url = soundsClient.getSound("lizard");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have lizard", contains);
	}
	@Test
	public void llamaTest() {
		String url = soundsClient.getSound("llama");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have llama", contains);
	}
	@Test
	public void lobsterTest() {
		String url = soundsClient.getSound("lobster");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have lobster", contains);
	}
	@Test
	public void locustTest() {
		String url = soundsClient.getSound("locust");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have locust", contains);
	}
	@Test
	public void loonTest() {
		String url = soundsClient.getSound("loon");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have loon", contains);
	}
	@Test
	public void louseTest() {
		String url = soundsClient.getSound("louse");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have louse", contains);
	}
	@Test
	public void lungfishTest() {
		String url = soundsClient.getSound("lungfish");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have lungfish", contains);
	}
	@Test
	public void lynxTest() {
		String url = soundsClient.getSound("lynx");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have lynx", contains);
	}
	@Test
	public void macawTest() {
		String url = soundsClient.getSound("macaw");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have macaw", contains);
	}
	@Test
	public void mackerelTest() {
		String url = soundsClient.getSound("mackerel");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have mackerel", contains);
	}
	@Test
	public void magpieTest() {
		String url = soundsClient.getSound("magpie");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have magpie", contains);
	}
	@Test
	public void mammalTest() {
		String url = soundsClient.getSound("mammal");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have mammal", contains);
	}
	@Test
	public void manateeTest() {
		String url = soundsClient.getSound("manatee");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have manatee", contains);
	}
	@Test
	public void mandrillTest() {
		String url = soundsClient.getSound("mandrill");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have mandrill", contains);
	}
	@Test
	public void mantarayTest() {
		String url = soundsClient.getSound("manta ray");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have manta ray", contains);
	}
	@Test
	public void marlinTest() {
		String url = soundsClient.getSound("marlin");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have marlin", contains);
	}
	@Test
	public void marmosetTest() {
		String url = soundsClient.getSound("marmoset");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have marmoset", contains);
	}
	@Test
	public void marmotTest() {
		String url = soundsClient.getSound("marmot");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have marmot", contains);
	}
	@Test
	public void marsupialTest() {
		String url = soundsClient.getSound("marsupial");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have marsupial", contains);
	}
	@Test
	public void martenTest() {
		String url = soundsClient.getSound("marten");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have marten", contains);
	}
	@Test
	public void mastodonTest() {
		String url = soundsClient.getSound("mastodon");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have mastodon", contains);
	}
	@Test
	public void meadowlarkTest() {
		String url = soundsClient.getSound("meadowlark");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have meadowlark", contains);
	}
	@Test
	public void meerkatTest() {
		String url = soundsClient.getSound("meerkat");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have meerkat", contains);
	}
	@Test
	public void minkTest() {
		String url = soundsClient.getSound("mink");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have mink", contains);
	}
	@Test
	public void minnowTest() {
		String url = soundsClient.getSound("minnow");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have minnow", contains);
	}
	@Test
	public void miteTest() {
		String url = soundsClient.getSound("mite");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have mite", contains);
	}
	@Test
	public void mockingbirdTest() {
		String url = soundsClient.getSound("mockingbird");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have mockingbird", contains);
	}
	@Test
	public void moleTest() {
		String url = soundsClient.getSound("mole");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have mole", contains);
	}
	@Test
	public void molluskTest() {
		String url = soundsClient.getSound("mollusk");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have mollusk", contains);
	}
	@Test
	public void mongooseTest() {
		String url = soundsClient.getSound("mongoose");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have mongoose", contains);
	}
	@Test
	public void monitorlizardTest() {
		String url = soundsClient.getSound("monitor lizard");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have monitor lizard", contains);
	}
	@Test
	public void monkeyTest() {
		String url = soundsClient.getSound("monkey");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have monkey", contains);
	}
	@Test
	public void mooseTest() {
		String url = soundsClient.getSound("moose");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have moose", contains);
	}
	@Test
	public void mosquitoTest() {
		String url = soundsClient.getSound("mosquito");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have mosquito", contains);
	}
	@Test
	public void mothTest() {
		String url = soundsClient.getSound("moth");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have moth", contains);
	}
	@Test
	public void mountaingoatTest() {
		String url = soundsClient.getSound("mountain goat");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have mountain goat", contains);
	}
	@Test
	public void mouseTest() {
		String url = soundsClient.getSound("mouse");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have mouse", contains);
	}
	@Test
	public void muleTest() {
		String url = soundsClient.getSound("mule");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have mule", contains);
	}
	@Test
	public void muskoxTest() {
		String url = soundsClient.getSound("muskox");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have muskox", contains);
	}
	@Test
	public void narwhalTest() {
		String url = soundsClient.getSound("narwhal");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have narwhal", contains);
	}
	@Test
	public void newtTest() {
		String url = soundsClient.getSound("newt");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have newt", contains);
	}
	@Test
	public void nightingaleTest() {
		String url = soundsClient.getSound("nightingale");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have nightingale", contains);
	}
	@Test
	public void ocelotTest() {
		String url = soundsClient.getSound("ocelot");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have ocelot", contains);
	}
	@Test
	public void octopusTest() {
		String url = soundsClient.getSound("octopus");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have octopus", contains);
	}
	@Test
	public void opossumTest() {
		String url = soundsClient.getSound("opossum");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have opossum", contains);
	}
	@Test
	public void orangutanTest() {
		String url = soundsClient.getSound("orangutan");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have orangutan", contains);
	}
	@Test
	public void orcaTest() {
		String url = soundsClient.getSound("orca");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have orca", contains);
	}
	@Test
	public void ostrichTest() {
		String url = soundsClient.getSound("ostrich");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have ostrich", contains);
	}
	@Test
	public void otterTest() {
		String url = soundsClient.getSound("otter");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have otter", contains);
	}
	@Test
	public void owlTest() {
		String url = soundsClient.getSound("owl");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have owl", contains);
	}
	@Test
	public void oxTest() {
		String url = soundsClient.getSound("ox");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have ox", contains);
	}
	@Test
	public void pandaTest() {
		String url = soundsClient.getSound("panda");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have panda", contains);
	}
	@Test
	public void pantherTest() {
		String url = soundsClient.getSound("panther");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have panther", contains);
	}
	@Test
	public void pantherahybridTest() {
		String url = soundsClient.getSound("panthera hybrid");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have panthera hybrid", contains);
	}
	@Test
	public void parakeetTest() {
		String url = soundsClient.getSound("parakeet");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have parakeet", contains);
	}
	@Test
	public void parrotTest() {
		String url = soundsClient.getSound("parrot");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have parrot", contains);
	}
	@Test
	public void parrotfishTest() {
		String url = soundsClient.getSound("parrotfish");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have parrotfish", contains);
	}
	@Test
	public void partridgeTest() {
		String url = soundsClient.getSound("partridge");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have partridge", contains);
	}
	@Test
	public void peacockTest() {
		String url = soundsClient.getSound("peacock");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have peacock", contains);
	}
	@Test
	public void peafowlTest() {
		String url = soundsClient.getSound("peafowl");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have peafowl", contains);
	}
	@Test
	public void pelicanTest() {
		String url = soundsClient.getSound("pelican");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have pelican", contains);
	}
	@Test
	public void penguinTest() {
		String url = soundsClient.getSound("penguin");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have penguin", contains);
	}
	@Test
	public void perchTest() {
		String url = soundsClient.getSound("perch");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have perch", contains);
	}
	@Test
	public void peregrinefalconTest() {
		String url = soundsClient.getSound("peregrine falcon");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have peregrine falcon", contains);
	}
	@Test
	public void pheasantTest() {
		String url = soundsClient.getSound("pheasant");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have pheasant", contains);
	}
	@Test
	public void pigTest() {
		String url = soundsClient.getSound("pig");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have pig", contains);
	}
	@Test
	public void pigeonTest() {
		String url = soundsClient.getSound("pigeon");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have pigeon", contains);
	}
	@Test
	public void pikeTest() {
		String url = soundsClient.getSound("pike");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have pike", contains);
	}
	@Test
	public void pilotwhaleTest() {
		String url = soundsClient.getSound("pilot whale");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have pilot whale", contains);
	}
	@Test
	public void pinnipedTest() {
		String url = soundsClient.getSound("pinniped");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have pinniped", contains);
	}
	@Test
	public void piranhaTest() {
		String url = soundsClient.getSound("piranha");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have piranha", contains);
	}
	@Test
	public void planarianTest() {
		String url = soundsClient.getSound("planarian");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have planarian", contains);
	}
	@Test
	public void platypusTest() {
		String url = soundsClient.getSound("platypus");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have platypus", contains);
	}
	@Test
	public void polarbearTest() {
		String url = soundsClient.getSound("polar bear");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have polar bear", contains);
	}
	@Test
	public void ponyTest() {
		String url = soundsClient.getSound("pony");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have pony", contains);
	}
	@Test
	public void porcupineTest() {
		String url = soundsClient.getSound("porcupine");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have porcupine", contains);
	}
	@Test
	public void porpoiseTest() {
		String url = soundsClient.getSound("porpoise");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have porpoise", contains);
	}
	@Test
	public void possumTest() {
		String url = soundsClient.getSound("possum");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have possum", contains);
	}
	@Test
	public void prairiedogTest() {
		String url = soundsClient.getSound("prairie dog");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have prairie dog", contains);
	}
	@Test
	public void prawnTest() {
		String url = soundsClient.getSound("prawn");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have prawn", contains);
	}
	@Test
	public void prayingmantisTest() {
		String url = soundsClient.getSound("praying mantis");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have praying mantis", contains);
	}
	@Test
	public void primateTest() {
		String url = soundsClient.getSound("primate");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have primate", contains);
	}
	@Test
	public void ptarmiganTest() {
		String url = soundsClient.getSound("ptarmigan");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have ptarmigan", contains);
	}
	@Test
	public void puffinTest() {
		String url = soundsClient.getSound("puffin");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have puffin", contains);
	}
	@Test
	public void pumaTest() {
		String url = soundsClient.getSound("puma");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have puma", contains);
	}
	@Test
	public void pythonTest() {
		String url = soundsClient.getSound("python");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have python", contains);
	}
	@Test
	public void quailTest() {
		String url = soundsClient.getSound("quail");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have quail", contains);
	}
	@Test
	public void queleaTest() {
		String url = soundsClient.getSound("quelea");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have quelea", contains);
	}
	@Test
	public void quokkaTest() {
		String url = soundsClient.getSound("quokka");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have quokka", contains);
	}
	@Test
	public void rabbitTest() {
		String url = soundsClient.getSound("rabbit");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have rabbit", contains);
	}
	@Test
	public void raccoonTest() {
		String url = soundsClient.getSound("raccoon");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have raccoon", contains);
	}
	@Test
	public void rainbowtroutTest() {
		String url = soundsClient.getSound("rainbow trout");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have rainbow trout", contains);
	}
	@Test
	public void ratTest() {
		String url = soundsClient.getSound("rat");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have rat", contains);
	}
	@Test
	public void rattlesnakeTest() {
		String url = soundsClient.getSound("rattlesnake");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have rattlesnake", contains);
	}
	@Test
	public void ravenTest() {
		String url = soundsClient.getSound("raven");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have raven", contains);
	}
	@Test
	public void rayTest() {
		String url = soundsClient.getSound("ray");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have ray", contains);
	}
	@Test
	public void redpandaTest() {
		String url = soundsClient.getSound("red panda");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have red panda", contains);
	}
	@Test
	public void reindeerTest() {
		String url = soundsClient.getSound("reindeer");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have reindeer", contains);
	}
	@Test
	public void reptileTest() {
		String url = soundsClient.getSound("reptile");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have reptile", contains);
	}
	@Test
	public void rhinocerosTest() {
		String url = soundsClient.getSound("rhinoceros");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have rhinoceros", contains);
	}
	@Test
	public void rightwhaleTest() {
		String url = soundsClient.getSound("right whale");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have right whale", contains);
	}
	@Test
	public void roadrunnerTest() {
		String url = soundsClient.getSound("roadrunner");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have roadrunner", contains);
	}
	@Test
	public void rodentTest() {
		String url = soundsClient.getSound("rodent");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have rodent", contains);
	}
	@Test
	public void rookTest() {
		String url = soundsClient.getSound("rook");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have rook", contains);
	}
	@Test
	public void roosterTest() {
		String url = soundsClient.getSound("rooster");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have rooster", contains);
	}
	@Test
	public void roundwormTest() {
		String url = soundsClient.getSound("roundworm");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have roundworm", contains);
	}
	@Test
	public void sabertoothedcatTest() {
		String url = soundsClient.getSound("saber-toothed cat");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have saber-toothed cat", contains);
	}
	@Test
	public void sailfishTest() {
		String url = soundsClient.getSound("sailfish");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have sailfish", contains);
	}
	@Test
	public void salamanderTest() {
		String url = soundsClient.getSound("salamander");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have salamander", contains);
	}
	@Test
	public void salmonTest() {
		String url = soundsClient.getSound("salmon");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have salmon", contains);
	}
	@Test
	public void sawfishTest() {
		String url = soundsClient.getSound("sawfish");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have sawfish", contains);
	}
	@Test
	public void scaleinsectTest() {
		String url = soundsClient.getSound("scale insect");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have scale insect", contains);
	}
	@Test
	public void scallopTest() {
		String url = soundsClient.getSound("scallop");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have scallop", contains);
	}
	@Test
	public void scorpionTest() {
		String url = soundsClient.getSound("scorpion");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have scorpion", contains);
	}
	@Test
	public void seahorseTest() {
		String url = soundsClient.getSound("seahorse");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have seahorse", contains);
	}
	@Test
	public void sealionTest() {
		String url = soundsClient.getSound("sea lion");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have sea lion", contains);
	}
	@Test
	public void seaslugTest() {
		String url = soundsClient.getSound("sea slug");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have sea slug", contains);
	}
	@Test
	public void seasnailTest() {
		String url = soundsClient.getSound("sea snail");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have sea snail", contains);
	}
	@Test
	public void sharkTest() {
		String url = soundsClient.getSound("shark");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have shark", contains);
	}
	@Test
	public void sheepTest() {
		String url = soundsClient.getSound("sheep");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have sheep", contains);
	}
	@Test
	public void shrewTest() {
		String url = soundsClient.getSound("shrew");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have shrew", contains);
	}
	@Test
	public void shrimpTest() {
		String url = soundsClient.getSound("shrimp");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have shrimp", contains);
	}
	@Test
	public void silkwormTest() {
		String url = soundsClient.getSound("silkworm");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have silkworm", contains);
	}
	@Test
	public void silverfishTest() {
		String url = soundsClient.getSound("silverfish");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have silverfish", contains);
	}
	@Test
	public void skinkTest() {
		String url = soundsClient.getSound("skink");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have skink", contains);
	}
	@Test
	public void skunkTest() {
		String url = soundsClient.getSound("skunk");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have skunk", contains);
	}
	@Test
	public void slothTest() {
		String url = soundsClient.getSound("sloth");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have sloth", contains);
	}
	@Test
	public void slugTest() {
		String url = soundsClient.getSound("slug");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have slug", contains);
	}
	@Test
	public void smeltTest() {
		String url = soundsClient.getSound("smelt");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have smelt", contains);
	}
	@Test
	public void snailTest() {
		String url = soundsClient.getSound("snail");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have snail", contains);
	}
	@Test
	public void snakeTest() {
		String url = soundsClient.getSound("snake");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have snake", contains);
	}
	@Test
	public void snipeTest() {
		String url = soundsClient.getSound("snipe");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have snipe", contains);
	}
	@Test
	public void snowleopardTest() {
		String url = soundsClient.getSound("snow leopard");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have snow leopard", contains);
	}
	@Test
	public void sockeyesalmonTest() {
		String url = soundsClient.getSound("sockeye salmon");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have sockeye salmon", contains);
	}
	@Test
	public void soleTest() {
		String url = soundsClient.getSound("sole");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have sole", contains);
	}
	@Test
	public void sparrowTest() {
		String url = soundsClient.getSound("sparrow");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have sparrow", contains);
	}
	@Test
	public void spermwhaleTest() {
		String url = soundsClient.getSound("sperm whale");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have sperm whale", contains);
	}
	@Test
	public void spiderTest() {
		String url = soundsClient.getSound("spider");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have spider", contains);
	}
	@Test
	public void spidermonkeyTest() {
		String url = soundsClient.getSound("spider monkey");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have spider monkey", contains);
	}
	@Test
	public void spoonbillTest() {
		String url = soundsClient.getSound("spoonbill");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have spoonbill", contains);
	}
	@Test
	public void squidTest() {
		String url = soundsClient.getSound("squid");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have squid", contains);
	}
	@Test
	public void squirrelTest() {
		String url = soundsClient.getSound("squirrel");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have squirrel", contains);
	}
	@Test
	public void starfishTest() {
		String url = soundsClient.getSound("starfish");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have starfish", contains);
	}
	@Test
	public void starnosedmoleTest() {
		String url = soundsClient.getSound("star-nosed mole");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have star-nosed mole", contains);
	}
	@Test
	public void steelheadtroutTest() {
		String url = soundsClient.getSound("steelhead trout");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have steelhead trout", contains);
	}
	@Test
	public void stingrayTest() {
		String url = soundsClient.getSound("stingray");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have stingray", contains);
	}
	@Test
	public void stoatTest() {
		String url = soundsClient.getSound("stoat");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have stoat", contains);
	}
	@Test
	public void storkTest() {
		String url = soundsClient.getSound("stork");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have stork", contains);
	}
	@Test
	public void sturgeonTest() {
		String url = soundsClient.getSound("sturgeon");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have sturgeon", contains);
	}
	@Test
	public void sugargliderTest() {
		String url = soundsClient.getSound("sugar glider");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have sugar glider", contains);
	}
	@Test
	public void swallowTest() {
		String url = soundsClient.getSound("swallow");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have swallow", contains);
	}
	@Test
	public void swanTest() {
		String url = soundsClient.getSound("swan");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have swan", contains);
	}
	@Test
	public void swiftTest() {
		String url = soundsClient.getSound("swift");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have swift", contains);
	}
	@Test
	public void swordfishTest() {
		String url = soundsClient.getSound("swordfish");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have swordfish", contains);
	}
	@Test
	public void swordtailTest() {
		String url = soundsClient.getSound("swordtail");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have swordtail", contains);
	}
	@Test
	public void tahrTest() {
		String url = soundsClient.getSound("tahr");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have tahr", contains);
	}
	@Test
	public void takinTest() {
		String url = soundsClient.getSound("takin");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have takin", contains);
	}
	@Test
	public void tapirTest() {
		String url = soundsClient.getSound("tapir");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have tapir", contains);
	}
	@Test
	public void tarantulaTest() {
		String url = soundsClient.getSound("tarantula");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have tarantula", contains);
	}
	@Test
	public void tarsierTest() {
		String url = soundsClient.getSound("tarsier");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have tarsier", contains);
	}
	@Test
	public void tasmaniandevilTest() {
		String url = soundsClient.getSound("tasmanian devil");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have tasmanian devil", contains);
	}
	@Test
	public void termiteTest() {
		String url = soundsClient.getSound("termite");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have termite", contains);
	}
	@Test
	public void ternTest() {
		String url = soundsClient.getSound("tern");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have tern", contains);
	}
	@Test
	public void thrushTest() {
		String url = soundsClient.getSound("thrush");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have thrush", contains);
	}
	@Test
	public void tickTest() {
		String url = soundsClient.getSound("tick");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have tick", contains);
	}
	@Test
	public void tigerTest() {
		String url = soundsClient.getSound("tiger");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have tiger", contains);
	}
	@Test
	public void tigersharkTest() {
		String url = soundsClient.getSound("tiger shark");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have tiger shark", contains);
	}
	@Test
	public void tiglonTest() {
		String url = soundsClient.getSound("tiglon");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have tiglon", contains);
	}
	@Test
	public void toadTest() {
		String url = soundsClient.getSound("toad");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have toad", contains);
	}
	@Test
	public void tortoiseTest() {
		String url = soundsClient.getSound("tortoise");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have tortoise", contains);
	}
	@Test
	public void toucanTest() {
		String url = soundsClient.getSound("toucan");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have toucan", contains);
	}
	@Test
	public void trapdoorspiderTest() {
		String url = soundsClient.getSound("trapdoor spider");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have trapdoor spider", contains);
	}
	@Test
	public void treefrogTest() {
		String url = soundsClient.getSound("tree frog");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have tree frog", contains);
	}
	@Test
	public void troutTest() {
		String url = soundsClient.getSound("trout");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have trout", contains);
	}
	@Test
	public void tunaTest() {
		String url = soundsClient.getSound("tuna");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have tuna", contains);
	}
	@Test
	public void turkeyTest() {
		String url = soundsClient.getSound("turkey");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have turkey", contains);
	}
	@Test
	public void turtleTest() {
		String url = soundsClient.getSound("turtle");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have turtle", contains);
	}
	@Test
	public void tyrannosaurusTest() {
		String url = soundsClient.getSound("tyrannosaurus");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have tyrannosaurus", contains);
	}
	@Test
	public void urialTest() {
		String url = soundsClient.getSound("urial");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have urial", contains);
	}
	@Test
	public void vampirebatTest() {
		String url = soundsClient.getSound("vampire bat");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have vampire bat", contains);
	}
	@Test
	public void vampiresquidTest() {
		String url = soundsClient.getSound("vampire squid");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have vampire squid", contains);
	}
	@Test
	public void vicunaTest() {
		String url = soundsClient.getSound("vicuna");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have vicuna", contains);
	}
	@Test
	public void viperTest() {
		String url = soundsClient.getSound("viper");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have viper", contains);
	}
	@Test
	public void voleTest() {
		String url = soundsClient.getSound("vole");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have vole", contains);
	}
	@Test
	public void vultureTest() {
		String url = soundsClient.getSound("vulture");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have vulture", contains);
	}
	@Test
	public void wallabyTest() {
		String url = soundsClient.getSound("wallaby");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have wallaby", contains);
	}
	@Test
	public void walrusTest() {
		String url = soundsClient.getSound("walrus");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have walrus", contains);
	}
	@Test
	public void waspTest() {
		String url = soundsClient.getSound("wasp");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have wasp", contains);
	}
	@Test
	public void warblerTest() {
		String url = soundsClient.getSound("warbler");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have warbler", contains);
	}
	@Test
	public void waterBoaTest() {
		String url = soundsClient.getSound("water Boa");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have water Boa", contains);
	}
	@Test
	public void waterbuffaloTest() {
		String url = soundsClient.getSound("water buffalo");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have water buffalo", contains);
	}
	@Test
	public void weaselTest() {
		String url = soundsClient.getSound("weasel");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have weasel", contains);
	}
	@Test
	public void whaleTest() {
		String url = soundsClient.getSound("whale");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have whale", contains);
	}
	@Test
	public void whippetTest() {
		String url = soundsClient.getSound("whippet");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have whippet", contains);
	}
	@Test
	public void whitefishTest() {
		String url = soundsClient.getSound("whitefish");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have whitefish", contains);
	}
	@Test
	public void whoopingcraneTest() {
		String url = soundsClient.getSound("whooping crane");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have whooping crane", contains);
	}
	@Test
	public void wildcatTest() {
		String url = soundsClient.getSound("wildcat");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have wildcat", contains);
	}
	@Test
	public void wildebeestTest() {
		String url = soundsClient.getSound("wildebeest");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have wildebeest", contains);
	}
	@Test
	public void wildfowlTest() {
		String url = soundsClient.getSound("wildfowl");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have wildfowl", contains);
	}
	@Test
	public void wolfTest() {
		String url = soundsClient.getSound("wolf");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have wolf", contains);
	}
	@Test
	public void wolverineTest() {
		String url = soundsClient.getSound("wolverine");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have wolverine", contains);
	}
	@Test
	public void wombatTest() {
		String url = soundsClient.getSound("wombat");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have wombat", contains);
	}
	@Test
	public void woodpeckerTest() {
		String url = soundsClient.getSound("woodpecker");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have woodpecker", contains);
	}
	@Test
	public void wormTest() {
		String url = soundsClient.getSound("worm");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have worm", contains);
	}
	@Test
	public void wrenTest() {
		String url = soundsClient.getSound("wren");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have wren", contains);
	}
	@Test
	public void xerinaeTest() {
		String url = soundsClient.getSound("xerinae");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have xerinae", contains);
	}
	@Test
	public void yakTest() {
		String url = soundsClient.getSound("yak");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have yak", contains);
	}
	@Test
	public void zebraTest() {
		String url = soundsClient.getSound("zebra");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have zebra", contains);
	}
	@Test
	public void ambianceTest() {
		String url = soundsClient.getSound("ambiance");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have ambiance", contains);
	}
	@Test
	public void ambienceTest() {
		String url = soundsClient.getSound("ambience");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have ambience", contains);
	}
	@Test
	public void ambientTest() {
		String url = soundsClient.getSound("ambient");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have ambient", contains);
	}
	@Test
	public void atmosphereTest() {
		String url = soundsClient.getSound("atmosphere");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have atmosphere", contains);
	}
	@Test
	public void backgroundTest() {
		String url = soundsClient.getSound("background");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have background", contains);
	}
	@Test
	public void beatTest() {
		String url = soundsClient.getSound("beat");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have beat", contains);
	}
	@Test
	public void bellTest() {
		String url = soundsClient.getSound("bell");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have bell", contains);
	}
	@Test
	public void carTest() {
		String url = soundsClient.getSound("car");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have car", contains);
	}
	@Test
	public void carsTest() {
		String url = soundsClient.getSound("cars");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have cars", contains);
	}
	@Test
	public void cityTest() {
		String url = soundsClient.getSound("city");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have city", contains);
	}
	@Test
	public void clickTest() {
		String url = soundsClient.getSound("click");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have click", contains);
	}
	@Test
	public void closeTest() {
		String url = soundsClient.getSound("close");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have close", contains);
	}
	@Test
	public void computerTest() {
		String url = soundsClient.getSound("computer");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have computer", contains);
	}
	@Test
	public void creepyTest() {
		String url = soundsClient.getSound("creepy");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have creepy", contains);
	}
	@Test
	public void crowdTest() {
		String url = soundsClient.getSound("crowd");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have crowd", contains);
	}
	@Test
	public void danceTest() {
		String url = soundsClient.getSound("dance");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have dance", contains);
	}
	@Test
	public void darkTest() {
		String url = soundsClient.getSound("dark");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have dark", contains);
	}
	@Test
	public void deepTest() {
		String url = soundsClient.getSound("deep");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have deep", contains);
	}
	@Test
	public void digitalTest() {
		String url = soundsClient.getSound("digital");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have digital", contains);
	}
	@Test
	public void doorTest() {
		String url = soundsClient.getSound("door");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have door", contains);
	}
	@Test
	public void droneTest() {
		String url = soundsClient.getSound("drone");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have drone", contains);
	}
	@Test
	public void drumTest() {
		String url = soundsClient.getSound("drum");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have drum", contains);
	}
	@Test
	public void drumsTest() {
		String url = soundsClient.getSound("drums");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have drums", contains);
	}
	@Test
	public void effectTest() {
		String url = soundsClient.getSound("effect");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have effect", contains);
	}
	@Test
	public void electricTest() {
		String url = soundsClient.getSound("electric");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have electric", contains);
	}
	@Test
	public void electroTest() {
		String url = soundsClient.getSound("electro");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have electro", contains);
	}
	@Test
	public void electronicTest() {
		String url = soundsClient.getSound("electronic");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have electronic", contains);
	}
	@Test
	public void engineTest() {
		String url = soundsClient.getSound("engine");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have engine", contains);
	}
	@Test
	public void englishTest() {
		String url = soundsClient.getSound("english");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have english", contains);
	}
	@Test
	public void femaleTest() {
		String url = soundsClient.getSound("female");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have female", contains);
	}
	@Test
	public void fieldTest() {
		String url = soundsClient.getSound("field");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have field", contains);
	}
	@Test
	public void fieldrecordingTest() {
		String url = soundsClient.getSound("field-recording");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have field-recording", contains);
	}
	@Test
	public void foleyTest() {
		String url = soundsClient.getSound("foley");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have foley", contains);
	}
	@Test
	public void footstepsTest() {
		String url = soundsClient.getSound("footsteps");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have footsteps", contains);
	}
	@Test
	public void fxTest() {
		String url = soundsClient.getSound("fx");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have fx", contains);
	}
	@Test
	public void gameTest() {
		String url = soundsClient.getSound("game");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have game", contains);
	}
	@Test
	public void girlTest() {
		String url = soundsClient.getSound("girl");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have girl", contains);
	}
	@Test
	public void glassTest() {
		String url = soundsClient.getSound("glass");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have glass", contains);
	}
	@Test
	public void glitchTest() {
		String url = soundsClient.getSound("glitch");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have glitch", contains);
	}
	@Test
	public void guitarTest() {
		String url = soundsClient.getSound("guitar");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have guitar", contains);
	}
	@Test
	public void hitTest() {
		String url = soundsClient.getSound("hit");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have hit", contains);
	}
	@Test
	public void horrorTest() {
		String url = soundsClient.getSound("horror");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have horror", contains);
	}
	@Test
	public void houseTest() {
		String url = soundsClient.getSound("house");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have house", contains);
	}
	@Test
	public void humanTest() {
		String url = soundsClient.getSound("human");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have human", contains);
	}
	@Test
	public void industrialTest() {
		String url = soundsClient.getSound("industrial");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have industrial", contains);
	}
	@Test
	public void kickTest() {
		String url = soundsClient.getSound("kick");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have kick", contains);
	}
	@Test
	public void kitchenTest() {
		String url = soundsClient.getSound("kitchen");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have kitchen", contains);
	}
	@Test
	public void loopTest() {
		String url = soundsClient.getSound("loop");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have loop", contains);
	}
	@Test
	public void machineTest() {
		String url = soundsClient.getSound("machine");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have machine", contains);
	}
	@Test
	public void maleTest() {
		String url = soundsClient.getSound("male");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have male", contains);
	}
	@Test
	public void metalTest() {
		String url = soundsClient.getSound("metal");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have metal", contains);
	}
	@Test
	public void metallicTest() {
		String url = soundsClient.getSound("metallic");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have metallic", contains);
	}
	@Test
	public void motorTest() {
		String url = soundsClient.getSound("motor");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have motor", contains);
	}
	@Test
	public void multisampleTest() {
		String url = soundsClient.getSound("multisample");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have multisample", contains);
	}
	@Test
	public void musicTest() {
		String url = soundsClient.getSound("music");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have music", contains);
	}
	@Test
	public void natureTest() {
		String url = soundsClient.getSound("nature");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have nature", contains);
	}
	@Test
	public void nightTest() {
		String url = soundsClient.getSound("night");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have night", contains);
	}
	@Test
	public void noiseTest() {
		String url = soundsClient.getSound("noise");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have noise", contains);
	}
	@Test
	public void openTest() {
		String url = soundsClient.getSound("open");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have open", contains);
	}
	@Test
	public void paperTest() {
		String url = soundsClient.getSound("paper");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have paper", contains);
	}
	@Test
	public void peopleTest() {
		String url = soundsClient.getSound("people");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have people", contains);
	}
	@Test
	public void percussionTest() {
		String url = soundsClient.getSound("percussion");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have percussion", contains);
	}
	@Test
	public void pianoTest() {
		String url = soundsClient.getSound("piano");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have piano", contains);
	}
	@Test
	public void processedTest() {
		String url = soundsClient.getSound("processed");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have processed", contains);
	}
	@Test
	public void radioTest() {
		String url = soundsClient.getSound("radio");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have radio", contains);
	}
	@Test
	public void rainTest() {
		String url = soundsClient.getSound("rain");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have rain", contains);
	}
	@Test
	public void recordingTest() {
		String url = soundsClient.getSound("recording");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have recording", contains);
	}
	@Test
	public void reverbTest() {
		String url = soundsClient.getSound("reverb");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have reverb", contains);
	}
	@Test
	public void rhythmTest() {
		String url = soundsClient.getSound("rhythm");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have rhythm", contains);
	}
	@Test
	public void sampleTest() {
		String url = soundsClient.getSound("sample");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have sample", contains);
	}
	@Test
	public void scaryTest() {
		String url = soundsClient.getSound("scary");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have scary", contains);
	}
	@Test
	public void scifiTest() {
		String url = soundsClient.getSound("sci-fi");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have sci-fi", contains);
	}
	@Test
	public void sfxTest() {
		String url = soundsClient.getSound("sfx");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have sfx", contains);
	}
	@Test
	public void soundTest() {
		String url = soundsClient.getSound("sound");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have sound", contains);
	}
	@Test
	public void soundscapeTest() {
		String url = soundsClient.getSound("soundscape");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have soundscape", contains);
	}
	@Test
	public void spaceTest() {
		String url = soundsClient.getSound("space");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have space", contains);
	}
	@Test
	public void speakTest() {
		String url = soundsClient.getSound("speak");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have speak", contains);
	}
	@Test
	public void stereoTest() {
		String url = soundsClient.getSound("stereo");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have stereo", contains);
	}
	@Test
	public void stormTest() {
		String url = soundsClient.getSound("storm");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have storm", contains);
	}
	@Test
	public void streetTest() {
		String url = soundsClient.getSound("street");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have street", contains);
	}
	@Test
	public void synthTest() {
		String url = soundsClient.getSound("synth");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have synth", contains);
	}
	@Test
	public void synthesizerTest() {
		String url = soundsClient.getSound("synthesizer");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have synthesizer", contains);
	}
	@Test
	public void talkTest() {
		String url = soundsClient.getSound("talk");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have talk", contains);
	}
	@Test
	public void technoTest() {
		String url = soundsClient.getSound("techno");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have techno", contains);
	}
	@Test
	public void thunderTest() {
		String url = soundsClient.getSound("thunder");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have thunder", contains);
	}
	@Test
	public void trafficTest() {
		String url = soundsClient.getSound("traffic");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have traffic", contains);
	}
	@Test
	public void trainTest() {
		String url = soundsClient.getSound("train");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have train", contains);
	}
	@Test
	public void vocalTest() {
		String url = soundsClient.getSound("vocal");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have vocal", contains);
	}
	@Test
	public void voiceTest() {
		String url = soundsClient.getSound("voice");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have voice", contains);
	}
	@Test
	public void walkingTest() {
		String url = soundsClient.getSound("walking");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have walking", contains);
	}
	@Test
	public void waterTest() {
		String url = soundsClient.getSound("water");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have water", contains);
	}
	@Test
	public void weatherTest() {
		String url = soundsClient.getSound("weather");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have weather", contains);
	}
	@Test
	public void weirdTest() {
		String url = soundsClient.getSound("weird");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have weird", contains);
	}
	@Test
	public void windTest() {
		String url = soundsClient.getSound("wind");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have wind", contains);
	}
	@Test
	public void womanTest() {
		String url = soundsClient.getSound("woman");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have woman", contains);
	}
	@Test
	public void woodTest() {
		String url = soundsClient.getSound("wood");
		boolean contains = url.contains(".mp3");
		Assert.assertTrue("Does not have wood", contains);
	}

	*/



}
