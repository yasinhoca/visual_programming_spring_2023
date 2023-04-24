namespace io_hesap_makinesi
{
    public partial class Form1 : Form
    {
        float s1, s2, sonuc;
        int islem = 0;
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            textBox1.Text += "1";
        }

        private void button2_Click(object sender, EventArgs e)
        {
            textBox1.Text += "2";
        }

        private void button3_Click(object sender, EventArgs e)
        {
            textBox1.Text += "3";
        }

        private void button4_Click(object sender, EventArgs e)
        {
            textBox1.Text += "4";
        }

        private void button5_Click(object sender, EventArgs e)
        {
            textBox1.Text += "5";
        }

        private void button6_Click(object sender, EventArgs e)
        {
            textBox1.Text += "6";
        }

        private void button7_Click(object sender, EventArgs e)
        {
            textBox1.Text += "7";
        }

        private void button8_Click(object sender, EventArgs e)
        {
            textBox1.Text += "8";
        }

        private void button9_Click(object sender, EventArgs e)
        {
            textBox1.Text += "9";
        }

        private void button13_Click(object sender, EventArgs e)
        {
            s1 = float.Parse(textBox1.Text);
            islem = 2;
            textBox1.Clear();
        }

        private void button14_Click(object sender, EventArgs e)
        {
            s1 = float.Parse(textBox1.Text);
            islem = 3;
            textBox1.Clear();
        }

        private void button15_Click(object sender, EventArgs e)
        {
            s1 = float.Parse(textBox1.Text);
            islem = 4;
            textBox1.Clear();
        }

        private void button16_Click(object sender, EventArgs e)
        {
            s2 = float.Parse(textBox1.Text);
            if (islem == 1)
            {
                sonuc = s1 + s2;
                textBox1.Text = sonuc.ToString();
            } else if (islem == 2)
            {
                sonuc = s1 - s2;
                textBox1.Text = sonuc.ToString();
            } else if (islem == 3)
            {
                sonuc = s1 * s2;
                textBox1.Text = sonuc.ToString();
            }
            else if (islem == 4)
            {
                sonuc = s1 / s2;
                textBox1.Text = sonuc.ToString();
            }
           
        }

        private void button11_Click(object sender, EventArgs e)
        {
            s1 = s2 = sonuc = 0;
            islem = 0;
            textBox1.Clear();
        }

        private void button10_Click(object sender, EventArgs e)
        {
            textBox1.Text += "0";
        }

        private void button12_Click(object sender, EventArgs e)
        {
            s1 = float.Parse(textBox1.Text);
            islem = 1;
            textBox1.Clear();
        }
    }
}