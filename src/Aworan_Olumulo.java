import javax.swing.*;
import java.awt.*;


@SuppressWarnings("serial")
public class Aworan_Olumulo extends JFrame{
	public static JButton Soro = new JButton("Sọ̀rọ̀");
	public static JButton dA = new JButton("À");
	public static JButton dE = new JButton("È");
	public static JButton dEE = new JButton("Ẹ̀");
	public static JButton dI = new JButton("Ì");
	public static JButton dO = new JButton("Ò");
	public static JButton dOO = new JButton("Ọ̀");
	public static JButton dU = new JButton("Ù");
	public static JButton mA = new JButton("Á");
	public static JButton mE = new JButton("É");
	public static JButton mEE = new JButton("Ẹ́");
	public static JButton mI = new JButton("Í");
	public static JButton mO = new JButton("Ó");
	public static JButton mOO = new JButton("Ọ́");
	public static JButton mU = new JButton("Ú");
	
	public static JButton W = new JButton("W");
	public static JButton E = new JButton("E");
	public static JButton R = new JButton("R");
	public static JButton T = new JButton("T");
	public static JButton Y = new JButton("Y");
	public static JButton U = new JButton("U");
	public static JButton I = new JButton("I");
	public static JButton O = new JButton("O");
	public static JButton P = new JButton("P");
	public static JButton PADA = new JButton();
	
	public static JButton OKE = new JButton();
	public static JButton A = new JButton("A");
	public static JButton S = new JButton("S");
	public static JButton D = new JButton("D");
	public static JButton F = new JButton("F");
	public static JButton G = new JButton("G");
	public static JButton H = new JButton("H");
	public static JButton J = new JButton("J");
	public static JButton K = new JButton("K");
	public static JButton L = new JButton("L");
	public static JButton WOLE = new JButton();
	
	public static JButton SS = new JButton("Ṣ");
	public static JButton GB = new JButton("GB");
	public static JButton EE = new JButton("Ẹ");
	public static JButton OO = new JButton("Ọ");
	public static JButton B = new JButton("B");
	public static JButton N = new JButton("N");
	public static JButton M = new JButton("M");
	public static JButton AminIdaduroDie = new JButton(",");
	public static JButton AminIdaduro = new JButton(".");
	
	public static JButton alafo = new JButton("");
	
	
	public static JButton da = new JButton("à");
	public static JButton de = new JButton("è");
	public static JButton dee = new JButton("ẹ̀");
	public static JButton di = new JButton("ì");
	public static JButton do0 = new JButton("ò");
	public static JButton doo = new JButton("ọ̀");
	public static JButton du = new JButton("ù");
	public static JButton ma = new JButton("á");
	public static JButton me = new JButton("é");
	public static JButton mee = new JButton("ẹ́");
	public static JButton mi = new JButton("í");
	public static JButton mo = new JButton("ó");
	public static JButton moo = new JButton("ọ́");
	public static JButton mu = new JButton("ú");
	
	public static JButton w = new JButton("w");
	public static JButton e = new JButton("e");
	public static JButton r = new JButton("r");
	public static JButton t = new JButton("t");
	public static JButton y = new JButton("y");
	public static JButton u = new JButton("u");
	public static JButton i = new JButton("i");
	public static JButton o = new JButton("o");
	public static JButton p = new JButton("p");
	public static JButton pada = new JButton();
	
	public static JButton oke = new JButton();
	public static JButton a = new JButton("a");
	public static JButton s = new JButton("s");
	public static JButton d = new JButton("d");
	public static JButton f = new JButton("f");
	public static JButton g = new JButton("g");
	public static JButton h = new JButton("h");
	public static JButton j = new JButton("j");
	public static JButton k = new JButton("k");
	public static JButton l = new JButton("l");
	public static JButton wole = new JButton();
	
	public static JButton ss = new JButton("ṣ");
	public static JButton gb = new JButton("gb");
	public static JButton ee = new JButton("ẹ");
	public static JButton oo = new JButton("ọ");
	public static JButton b = new JButton("b");
	public static JButton n = new JButton("n");
	public static JButton m = new JButton("m");
	public static JButton AminIdaduroDieKeji = new JButton(",");
	public static JButton AminIdaduroKeji = new JButton(".");
	
	public static JButton alafoKeji = new JButton("");
	
	
	
	public static JTextArea Oro = new JTextArea("Àwọn ọ̀rọ̀ Yorùbá");
	
	
	public static JScrollPane OroScrol = new JScrollPane(Oro);
	
	
	public static JRadioButton obirin = new JRadioButton("Obìrin");
	public static JRadioButton okunrin = new JRadioButton("Okùnrin");
	
	
	ImageIcon aworanOduduwa = new ImageIcon(getClass().getResource("aworan/Oduduwa.png"));
	ImageIcon Ila = new ImageIcon(getClass().getResource("aworan/Ila.png"));
	ImageIcon AalaYoruba = new ImageIcon(getClass().getResource("aworan/AalaYoruba.png"));
	ImageIcon OKEE = new ImageIcon(getClass().getResource("aworan/oke.png"));
	ImageIcon okee = new ImageIcon(getClass().getResource("aworan/okee.png"));
	ImageIcon ppada = new ImageIcon(getClass().getResource("aworan/pada.png"));
	ImageIcon PPADA = new ImageIcon(getClass().getResource("aworan/pada.png"));
	ImageIcon WWOLE = new ImageIcon(getClass().getResource("aworan/wole.png"));
	ImageIcon wwole = new ImageIcon(getClass().getResource("aworan/wole.png"));
	
	
	static Ise ise = new Ise();
	
	static CardLayout Iyipada = new CardLayout();
	
	
	public static JPanel IpeleAarinOjuIselana = new JPanel(new BorderLayout());
	public static JPanel IpeleBotini = new JPanel(Iyipada);
	
	
	
	
	
	
	
	
	
	public void Iselana() {
		
		JPanel OjuIselana = new JPanel(new BorderLayout());
		
// ************* OKE  *************
		
		JPanel IpeleOkeOjuIselana = new JPanel(new BorderLayout());
		
		JPanel IpeleOkeOjuIselanaKini = new JPanel(new FlowLayout(FlowLayout.LEFT));
		IpeleOkeOjuIselanaKini.setBackground(new Color(237,243,250));
		JLabel ede = new JLabel("  Èdè Abínibí (Èdè Yorùbá)");
		ede.setFont(new Font("Fugaz One",Font.PLAIN,16));
		IpeleOkeOjuIselanaKini.add(new JLabel(aworanOduduwa));
		IpeleOkeOjuIselanaKini.add(ede);
		
		IpeleOkeOjuIselana.setBackground(new Color(237,243,250));
		IpeleOkeOjuIselana.add(IpeleOkeOjuIselanaKini, BorderLayout.WEST);
		IpeleOkeOjuIselana.add(new JLabel(AalaYoruba), BorderLayout.EAST);
		IpeleOkeOjuIselana.add(new JLabel(Ila), BorderLayout.SOUTH);
		

// ************* AARIN  *************
		
		JPanel IpeleAarinOjuIselana = new JPanel(new BorderLayout());
		
			JPanel IpeleAarinOjuIselanaOke = new JPanel(new FlowLayout());
			JLabel ohun = new JLabel("Ohùn :");
			ohun.setFont(new Font("",Font.PLAIN,14));
			
			okunrin.setFont(new Font("",Font.PLAIN,14));
			obirin.setFont(new Font("",Font.PLAIN,14));
			
			ButtonGroup akopo = new ButtonGroup();
			akopo.add(okunrin);
			akopo.add(obirin);
			
			IpeleAarinOjuIselanaOke.add(ohun);
			IpeleAarinOjuIselanaOke.add(okunrin);
			IpeleAarinOjuIselanaOke.add(obirin);
			
			
			JPanel IpeleAarinOjuIselanaAarin = new JPanel(new BorderLayout());
				JPanel IpeleAarinOjuIselanaAarin_ = new JPanel(new GridLayout(1,1));
				Oro.setWrapStyleWord(true);
				Oro.setLineWrap(true);
				Oro.setFont(new Font("Calibri (Body)",Font.PLAIN,15));
				Oro.setMargin(new Insets(3,6,3,3));
				IpeleAarinOjuIselanaAarin_.add(OroScrol);
				
			IpeleAarinOjuIselanaAarin.add(IpeleAarinOjuIselanaAarin_, BorderLayout.CENTER);
				JPanel IpeleSoro = new JPanel(new FlowLayout(FlowLayout.LEFT));
				IpeleSoro.add(Soro);
				Soro.addActionListener(ise);
			IpeleAarinOjuIselanaAarin.add(IpeleSoro, BorderLayout.SOUTH);
			IpeleAarinOjuIselanaAarin.add(new JLabel("  "), BorderLayout.WEST);
			IpeleAarinOjuIselanaAarin.add(new JLabel("  "), BorderLayout.EAST);
			
			
		IpeleAarinOjuIselana.add(IpeleAarinOjuIselanaOke, BorderLayout.NORTH);
		IpeleAarinOjuIselana.add(IpeleAarinOjuIselanaAarin, BorderLayout.CENTER);
		
		
		
// ************* ISALE  *************
		
		dA.setBackground(Color.black);
		dA.setForeground(Color.white);
		dA.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		dE.setBackground(Color.black);
		dE.setForeground(Color.white);
		dE.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		dEE.setBackground(Color.black);
		dEE.setForeground(Color.white);
		dEE.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		dI.setBackground(Color.black);
		dI.setForeground(Color.white);
		dI.setFont(new Font("Times New Roman",Font.BOLD,14));
		dO.setBackground(Color.black);
		dO.setForeground(Color.white);
		dO.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		dOO.setBackground(Color.black);
		dOO.setForeground(Color.white);
		dOO.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		dU.setBackground(Color.black);
		dU.setForeground(Color.white);
		dU.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		mA.setBackground(Color.black);
		mA.setForeground(Color.white);
		mA.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		mE.setBackground(Color.black);
		mE.setForeground(Color.white);
		mE.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		mEE.setBackground(Color.black);
		mEE.setForeground(Color.white);
		mEE.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		mI.setBackground(Color.black);
		mI.setForeground(Color.white);
		mI.setFont(new Font("Times New Roman",Font.BOLD,14));
		mO.setBackground(Color.black);
		mO.setForeground(Color.white);
		mO.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		mOO.setBackground(Color.black);
		mOO.setForeground(Color.white);
		mOO.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		mU.setBackground(Color.black);
		mU.setForeground(Color.white);
		mU.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		
		W.setBackground(Color.black);
		W.setForeground(Color.white);
		W.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		E.setBackground(Color.black);
		E.setForeground(Color.white);
		E.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		R.setBackground(Color.black);
		R.setForeground(Color.white);
		R.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		T.setBackground(Color.black);
		T.setForeground(Color.white);
		T.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		Y.setBackground(Color.black);
		Y.setForeground(Color.white);
		Y.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		U.setBackground(Color.black);
		U.setForeground(Color.white);
		U.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		I.setBackground(Color.black);
		I.setForeground(Color.white);
		I.setFont(new Font("Times New Roman",Font.BOLD,14));
		O.setBackground(Color.black);
		O.setForeground(Color.white);
		O.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		P.setBackground(Color.black);
		P.setForeground(Color.white);
		P.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		PADA.setIcon(PPADA);
		PADA.setBackground(Color.black);								PADA.setEnabled(false);
		
		OKE.setIcon(OKEE);
		OKE.setBackground(Color.black);
		A.setBackground(Color.black);
		A.setForeground(Color.white);
		A.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		S.setBackground(Color.black);
		S.setForeground(Color.white);
		S.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		D.setBackground(Color.black);
		D.setForeground(Color.white);
		D.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		F.setBackground(Color.black);
		F.setForeground(Color.white);
		F.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		G.setBackground(Color.black);
		G.setForeground(Color.white);
		G.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		H.setBackground(Color.black);
		H.setForeground(Color.white);
		H.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		J.setBackground(Color.black);
		J.setForeground(Color.white);
		J.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		K.setBackground(Color.black);
		K.setForeground(Color.white);
		K.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		L.setBackground(Color.black);
		L.setForeground(Color.white);
		L.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		WOLE.setIcon(WWOLE);
		WOLE.setBackground(Color.black);
		
		SS.setBackground(Color.black);
		SS.setForeground(Color.white);
		SS.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		GB.setBackground(Color.black);
		GB.setForeground(Color.white);
		GB.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		EE.setBackground(Color.black);
		EE.setForeground(Color.white);
		EE.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		OO.setBackground(Color.black);
		OO.setForeground(Color.white);
		OO.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		B.setBackground(Color.black);
		B.setForeground(Color.white);
		B.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		N.setBackground(Color.black);
		N.setForeground(Color.white);
		N.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		M.setBackground(Color.black);
		M.setForeground(Color.white);
		M.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		AminIdaduroDie.setBackground(Color.black);
		AminIdaduroDie.setForeground(Color.white);
		AminIdaduroDie.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		AminIdaduro.setBackground(Color.black);
		AminIdaduro.setForeground(Color.white);
		AminIdaduro.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		
		alafo.setBackground(Color.black);
		alafo.setForeground(Color.white);
		alafo.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		
		
		da.setBackground(Color.black);
		da.setForeground(Color.white);
		da.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		de.setBackground(Color.black);
		de.setForeground(Color.white);
		de.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		dee.setBackground(Color.black);
		dee.setForeground(Color.white);
		dee.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		di.setBackground(Color.black);
		di.setForeground(Color.white);
		di.setFont(new Font("Times New Roman",Font.BOLD,14));
		do0.setBackground(Color.black);
		do0.setForeground(Color.white);
		do0.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		doo.setBackground(Color.black);
		doo.setForeground(Color.white);
		doo.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		du.setBackground(Color.black);
		du.setForeground(Color.white);
		du.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		ma.setBackground(Color.black);
		ma.setForeground(Color.white);
		ma.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		me.setBackground(Color.black);
		me.setForeground(Color.white);
		me.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		mee.setBackground(Color.black);
		mee.setForeground(Color.white);
		mee.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		mi.setBackground(Color.black);
		mi.setForeground(Color.white);
		mi.setFont(new Font("Times New Roman",Font.BOLD,14));
		mo.setBackground(Color.black);
		mo.setForeground(Color.white);
		mo.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		moo.setBackground(Color.black);
		moo.setForeground(Color.white);
		moo.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		mu.setBackground(Color.black);
		mu.setForeground(Color.white);
		mu.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		
		w.setBackground(Color.black);
		w.setForeground(Color.white);
		w.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		e.setBackground(Color.black);
		e.setForeground(Color.white);
		e.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		r.setBackground(Color.black);
		r.setForeground(Color.white);
		r.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		t.setBackground(Color.black);
		t.setForeground(Color.white);
		t.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		y.setBackground(Color.black);
		y.setForeground(Color.white);
		y.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		u.setBackground(Color.black);
		u.setForeground(Color.white);
		u.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		i.setBackground(Color.black);
		i.setForeground(Color.white);
		i.setFont(new Font("Times New Roman",Font.BOLD,14));
		o.setBackground(Color.black);
		o.setForeground(Color.white);
		o.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		p.setBackground(Color.black);
		p.setForeground(Color.white);
		p.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		pada.setIcon(ppada);
		pada.setBackground(Color.black);							pada.setEnabled(false);
		
		oke.setIcon(okee);
		oke.setBackground(Color.black);
		a.setBackground(Color.black);
		a.setForeground(Color.white);
		a.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		s.setBackground(Color.black);
		s.setForeground(Color.white);
		s.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		d.setBackground(Color.black);
		d.setForeground(Color.white);
		d.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		f.setBackground(Color.black);
		f.setForeground(Color.white);
		f.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		g.setBackground(Color.black);
		g.setForeground(Color.white);
		g.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		h.setBackground(Color.black);
		h.setForeground(Color.white);
		h.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		j.setBackground(Color.black);
		j.setForeground(Color.white);
		j.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		k.setBackground(Color.black);
		k.setForeground(Color.white);
		k.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		l.setBackground(Color.black);
		l.setForeground(Color.white);
		l.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		wole.setIcon(wwole);
		wole.setBackground(Color.black);
		
		ss.setBackground(Color.black);
		ss.setForeground(Color.white);
		ss.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		gb.setBackground(Color.black);
		gb.setForeground(Color.white);
		gb.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		ee.setBackground(Color.black);
		ee.setForeground(Color.white);
		ee.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		oo.setBackground(Color.black);
		oo.setForeground(Color.white);
		oo.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		b.setBackground(Color.black);
		b.setForeground(Color.white);
		b.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		n.setBackground(Color.black);
		n.setForeground(Color.white);
		n.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		m.setBackground(Color.black);
		m.setForeground(Color.white);
		m.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		AminIdaduroDieKeji.setBackground(Color.black);
		AminIdaduroDieKeji.setForeground(Color.white);
		AminIdaduroDieKeji.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		AminIdaduroKeji.setBackground(Color.black);
		AminIdaduroKeji.setForeground(Color.white);
		AminIdaduroKeji.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		
		alafoKeji.setBackground(Color.black);
		alafoKeji.setForeground(Color.white);
		alafoKeji.setFont(new Font("Calibri (Body)",Font.BOLD,14));
		
		
		JPanel IpeleIsaleOjuIselana = new JPanel(new BorderLayout());
		
			JPanel IpeleBotiniKini = new JPanel(new GridLayout(5,1));
				JPanel IpeleAkoko = new JPanel(new GridLayout(1,18,2,2));
				IpeleAkoko.setBackground(new Color(96,93,93));
				IpeleAkoko.add(new JLabel(""));
				IpeleAkoko.add(dA);
				IpeleAkoko.add(dE);
				IpeleAkoko.add(dEE);
				IpeleAkoko.add(dI);
				IpeleAkoko.add(dO);
				IpeleAkoko.add(dOO);
				IpeleAkoko.add(dU);
				IpeleAkoko.add(new JLabel(""));
				IpeleAkoko.add(new JLabel(""));
				IpeleAkoko.add(mA);
				IpeleAkoko.add(mE);
				IpeleAkoko.add(mEE);
				IpeleAkoko.add(mI);
				IpeleAkoko.add(mO);
				IpeleAkoko.add(mOO);
				IpeleAkoko.add(mU);
				IpeleAkoko.add(new JLabel(""));
				
				dA.addActionListener(ise);
				dE.addActionListener(ise);
				dEE.addActionListener(ise);
				dI.addActionListener(ise);
				dO.addActionListener(ise);
				dOO.addActionListener(ise);
				dU.addActionListener(ise);
				mA.addActionListener(ise);
				mE.addActionListener(ise);
				mEE.addActionListener(ise);
				mI.addActionListener(ise);
				mO.addActionListener(ise);
				mOO.addActionListener(ise);
				mU.addActionListener(ise);
				
	// ------------------------------------------------------------------------		
				JPanel IpeleEkeji = new JPanel(new GridLayout(1,10,2,2));
				IpeleEkeji.setBackground(new Color(96,93,93));
				IpeleEkeji.add(W);
				IpeleEkeji.add(E);
				IpeleEkeji.add(R);
				IpeleEkeji.add(T);
				IpeleEkeji.add(Y);
				IpeleEkeji.add(U);
				IpeleEkeji.add(I);
				IpeleEkeji.add(O);
				IpeleEkeji.add(P);
				IpeleEkeji.add(PADA);
				
				W.addActionListener(ise);
				E.addActionListener(ise);
				R.addActionListener(ise);
				T.addActionListener(ise);
				Y.addActionListener(ise);
				U.addActionListener(ise);
				I.addActionListener(ise);
				O.addActionListener(ise);
				P.addActionListener(ise);
				PADA.addActionListener(ise);
				
	// ------------------------------------------------------------------------			
				JPanel IpeleEketa = new JPanel(new GridLayout(1,11,2,2));
				IpeleEketa.setBackground(new Color(96,93,93));
				IpeleEketa.add(OKE);
				IpeleEketa.add(A);
				IpeleEketa.add(S);
				IpeleEketa.add(D);
				IpeleEketa.add(F);
				IpeleEketa.add(G);
				IpeleEketa.add(H);
				IpeleEketa.add(J);
				IpeleEketa.add(K);
				IpeleEketa.add(L);
				IpeleEketa.add(WOLE);
				
				OKE.addActionListener(ise);
				A.addActionListener(ise);
				S.addActionListener(ise);
				D.addActionListener(ise);
				F.addActionListener(ise);
				G.addActionListener(ise);
				H.addActionListener(ise);
				J.addActionListener(ise);
				K.addActionListener(ise);
				L.addActionListener(ise);
				WOLE.addActionListener(ise);
				
	// ------------------------------------------------------------------------
				JPanel IpeleEkerin = new JPanel(new GridLayout(1,13,2,2));
				IpeleEkerin.setBackground(new Color(96,93,93));
				IpeleEkerin.add(new JLabel(""));
				IpeleEkerin.add(new JLabel(""));
				IpeleEkerin.add(SS);
				IpeleEkerin.add(GB);
				IpeleEkerin.add(EE);
				IpeleEkerin.add(OO);
				IpeleEkerin.add(B);
				IpeleEkerin.add(N);
				IpeleEkerin.add(M);
				IpeleEkerin.add(AminIdaduroDie);
				IpeleEkerin.add(AminIdaduro);
				IpeleEkerin.add(new JLabel(""));
				IpeleEkerin.add(new JLabel(""));
				
				SS.addActionListener(ise);
				GB.addActionListener(ise);
				EE.addActionListener(ise);
				OO.addActionListener(ise);
				B.addActionListener(ise);
				N.addActionListener(ise);
				M.addActionListener(ise);
				AminIdaduroDie.addActionListener(ise);
				AminIdaduro.addActionListener(ise);
	// ------------------------------------------------------------------------
				JPanel IpeleEkarun = new JPanel(new GridLayout(1,3));
				IpeleEkarun.setBackground(new Color(96,93,93));
				IpeleEkarun.add(new JLabel(""));
				IpeleEkarun.add(alafo);
				IpeleEkarun.add(new JLabel(""));
				
				alafo.addActionListener(ise);
	// ------------------------------------------------------------------------
			
			IpeleBotiniKini.add(IpeleAkoko);
			IpeleBotiniKini.add(IpeleEkeji);
			IpeleBotiniKini.add(IpeleEketa);
			IpeleBotiniKini.add(IpeleEkerin);
			IpeleBotiniKini.add(IpeleEkarun);
			
			
			
	// ********************
			
			JPanel IpeleBotiniKeji = new JPanel(new GridLayout(5,1));
			JPanel IpeleAkokoKeji = new JPanel(new GridLayout(1,18,2,2));
			IpeleAkokoKeji.setBackground(new Color(96,93,93));
			IpeleAkokoKeji.add(new JLabel(""));
			IpeleAkokoKeji.add(da);
			IpeleAkokoKeji.add(de);
			IpeleAkokoKeji.add(dee);
			IpeleAkokoKeji.add(di);
			IpeleAkokoKeji.add(do0);
			IpeleAkokoKeji.add(doo);
			IpeleAkokoKeji.add(du);
			IpeleAkokoKeji.add(new JLabel(""));
			IpeleAkokoKeji.add(new JLabel(""));
			IpeleAkokoKeji.add(ma);
			IpeleAkokoKeji.add(me);
			IpeleAkokoKeji.add(mee);
			IpeleAkokoKeji.add(mi);
			IpeleAkokoKeji.add(mo);
			IpeleAkokoKeji.add(moo);
			IpeleAkokoKeji.add(mu);
			IpeleAkokoKeji.add(new JLabel(""));
			
			da.addActionListener(ise);
			de.addActionListener(ise);
			dee.addActionListener(ise);
			di.addActionListener(ise);
			do0.addActionListener(ise);
			doo.addActionListener(ise);
			du.addActionListener(ise);
			ma.addActionListener(ise);
			me.addActionListener(ise);
			mee.addActionListener(ise);
			mi.addActionListener(ise);
			mo.addActionListener(ise);
			moo.addActionListener(ise);
			mu.addActionListener(ise);
			
// ------------------------------------------------------------------------		
			JPanel IpeleEkejiKeji = new JPanel(new GridLayout(1,10,2,2));
			IpeleEkejiKeji.setBackground(new Color(96,93,93));
			IpeleEkejiKeji.add(w);
			IpeleEkejiKeji.add(e);
			IpeleEkejiKeji.add(r);
			IpeleEkejiKeji.add(r);
			IpeleEkejiKeji.add(t);
			IpeleEkejiKeji.add(y);
			IpeleEkejiKeji.add(u);
			IpeleEkejiKeji.add(i);
			IpeleEkejiKeji.add(o);
			IpeleEkejiKeji.add(p);
			IpeleEkejiKeji.add(pada);
			
			w.addActionListener(ise);
			e.addActionListener(ise);
			r.addActionListener(ise);
			t.addActionListener(ise);
			y.addActionListener(ise);
			u.addActionListener(ise);
			i.addActionListener(ise);
			o.addActionListener(ise);
			p.addActionListener(ise);
			pada.addActionListener(ise);
			
// ------------------------------------------------------------------------			
			JPanel IpeleEketaKeji = new JPanel(new GridLayout(1,11,2,2));
			IpeleEketaKeji.setBackground(new Color(96,93,93));
			IpeleEketaKeji.add(oke);
			IpeleEketaKeji.add(a);
			IpeleEketaKeji.add(s);
			IpeleEketaKeji.add(d);
			IpeleEketaKeji.add(f);
			IpeleEketaKeji.add(g);
			IpeleEketaKeji.add(h);
			IpeleEketaKeji.add(j);
			IpeleEketaKeji.add(k);
			IpeleEketaKeji.add(l);
			IpeleEketaKeji.add(wole);
			
			oke.addActionListener(ise);
			a.addActionListener(ise);
			s.addActionListener(ise);
			d.addActionListener(ise);
			f.addActionListener(ise);
			g.addActionListener(ise);
			h.addActionListener(ise);
			j.addActionListener(ise);
			k.addActionListener(ise);
			l.addActionListener(ise);
			wole.addActionListener(ise);
			
// ------------------------------------------------------------------------
			JPanel IpeleEkerinKeji = new JPanel(new GridLayout(1,13,2,2));
			IpeleEkerinKeji.setBackground(new Color(96,93,93));
			IpeleEkerinKeji.add(new JLabel(""));
			IpeleEkerinKeji.add(new JLabel(""));
			IpeleEkerinKeji.add(ss);
			IpeleEkerinKeji.add(gb);
			IpeleEkerinKeji.add(ee);
			IpeleEkerinKeji.add(oo);
			IpeleEkerinKeji.add(b);
			IpeleEkerinKeji.add(n);
			IpeleEkerinKeji.add(m);
			IpeleEkerinKeji.add(AminIdaduroDieKeji);
			IpeleEkerinKeji.add(AminIdaduroKeji);
			IpeleEkerinKeji.add(new JLabel(""));
			IpeleEkerinKeji.add(new JLabel(""));
			
			ss.addActionListener(ise);
			gb.addActionListener(ise);
			ee.addActionListener(ise);
			oo.addActionListener(ise);
			b.addActionListener(ise);
			n.addActionListener(ise);
			m.addActionListener(ise);
			AminIdaduroDieKeji.addActionListener(ise);
			AminIdaduroKeji.addActionListener(ise);
// ------------------------------------------------------------------------
			JPanel IpeleEkarunKeji = new JPanel(new GridLayout(1,3));
			IpeleEkarunKeji.setBackground(new Color(96,93,93));
			IpeleEkarunKeji.add(new JLabel(""));
			IpeleEkarunKeji.add(alafoKeji);
			IpeleEkarunKeji.add(new JLabel(""));
			
			alafoKeji.addActionListener(ise);
// ------------------------------------------------------------------------
		
		IpeleBotiniKeji.add(IpeleAkokoKeji);
		IpeleBotiniKeji.add(IpeleEkejiKeji);
		IpeleBotiniKeji.add(IpeleEketaKeji);
		IpeleBotiniKeji.add(IpeleEkerinKeji);
		IpeleBotiniKeji.add(IpeleEkarunKeji);
		
			
			
			
			
			
			
			
			
			IpeleBotini.add(IpeleBotiniKini, "BotiniKini");
			IpeleBotini.add(IpeleBotiniKeji, "BotiniKeji");
			
			JPanel IpeleOluko = new JPanel(new FlowLayout(FlowLayout.RIGHT));
			JLabel bb = new JLabel("© B.B.WISE    ");
			bb.setForeground(new Color(145,6,140));
			bb.setFont(new Font("Calibril",Font.BOLD,12));
			IpeleOluko.add(bb);
			
			
		IpeleIsaleOjuIselana.add(IpeleBotini, BorderLayout.CENTER);
		IpeleIsaleOjuIselana.add(new JLabel("               "), BorderLayout.WEST);
		IpeleIsaleOjuIselana.add(new JLabel("               "), BorderLayout.EAST);
		IpeleIsaleOjuIselana.add(IpeleOluko, BorderLayout.SOUTH);
		
		
		
		
		OjuIselana.add(IpeleOkeOjuIselana, BorderLayout.NORTH);
		OjuIselana.add(IpeleAarinOjuIselana, BorderLayout.CENTER);
		OjuIselana.add(IpeleIsaleOjuIselana, BorderLayout.SOUTH);
		
		
		
		add(OjuIselana);
		
	}

	public static void main(String[] args) {
		
		Aworan_Olumulo ilanaKini = new Aworan_Olumulo();
		ilanaKini.Iselana();
		ilanaKini.setTitle("Èdè Abínibí");
		ilanaKini.setSize(950,650);
		ilanaKini.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ilanaKini.setResizable(false);
		ilanaKini.setLocationRelativeTo(null);
		ilanaKini.setVisible(true);

	}

}
