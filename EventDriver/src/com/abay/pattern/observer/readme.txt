Obervable �۲����
Oberver  �ǹ۲���

��Ʊ�Ǳ��۲����
�����ǹ۲���
  ��Ʊ�ı䣬�������յ���Ӧ����Ϣ��

��Ҫ���֣� �۲���һ���ı� ��֪ͨ�۲��� ,��һ��һ�Զ�� ��Ϣ�������,
����ʵ�ַ��������۲����observale��ͨ�����鱣��(�۲���) ��һ���۲���� �ı�ֵ����֪ͨ  ��update��
setChanged();
notifyObservers();


Java �ṩ�� Observer ģʽ��Ĭ��ʵ�֣��������ǾͿ�һ�� Java �� �۲���ģʽ��֧�֡�
Java �� �۲���ģʽ��֧�� ��Ҫ������ Observable  ��� Observer �ӿڡ�

(1) Observable  ����� ���۲��� ��java.util.Observable ��
        ��Ҫ�����У�
        void setChanged() �� ���ñ��۲��ߵ�״̬�Ѿ����ı�
        void addObserver(Observer  observer) �� ��ӹ۲���
        int countObservers() �� �������й۲��ߵ���Ŀ
        void deleteObserver(Observer  observer) ��ɾ��ָ���۲��� 
        void deleteObservers() �� ɾ�����й۲���
        boolean hasChanged() �� ���۲��ߵ�״̬�Ƿ񱻸ı䣬������򷵻�true�����򷵻�false
        void notifyObservers()  �� ֪ͨ���й۲��ߣ�û�в�����
        void notifyObservers(Object arg) �� ֪ͨ���й۲��ߣ�������������һ���趨Ϊ���ı�����ԣ�
        void clearChanged() ��������۲���״̬�ĸı䣨������ hasChanged() ʱ�᷵�� false��
(2) Observer �ӿڴ��� �۲��� ��java.util.Observer ��
        ��ֻ��һ�����󷽷���Ҫ������Ĺ۲�����ʵ�֣�����Ҫ ����
        void update(Observable observable, Object arg) ���� ���۲��� ���� notifyObservers(*) ����
ʱ������ݱ��۲��ߵ� hasChanged() ���� ���ж� ����״̬�Ƿ񱻸ı䣬 ������۲��ߵ�״̬���ı��ˣ���
����� �۲��� �� update ���������� observable Ϊ ���۲��߶��� arg Ϊ���� notifyObservers( Object arg )
 ʱ����Ĳ��� arg ��������õ��� notifyObservers() ������ �� arg Ϊ null�� ע�� ��Ӧ�ð�������� arg 
 �趨Ϊ ���۲��ߵ� ���ı�����ԣ���