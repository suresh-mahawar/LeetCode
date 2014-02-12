package leetcode;

public class SingleNumber1 {
	public int SingleNumber(int [] numbers){
		int result = 0;
		int NumArr[]={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		for(int i : numbers){
			NumArr[0] += ((1<<0)&i)>0? 1 : 0;
			NumArr[1] += ((1<<1)&i)>0? 1 : 0;
			NumArr[2] += ((1<<2)&i)>0? 1 : 0;
			NumArr[3] += ((1<<3)&i)>0? 1 : 0;
			NumArr[4] += ((1<<4)&i)>0? 1 : 0;
			NumArr[5] += ((1<<5)&i)>0? 1 : 0;
			NumArr[6] += ((1<<6)&i)>0? 1 : 0;
			NumArr[7] += ((1<<7)&i)>0? 1 : 0;
			
			NumArr[8] += ((1<<8)&i)>0? 1 : 0;
			NumArr[9] += ((1<<9)&i)>0? 1 : 0;
			NumArr[10] += ((1<<10)&i)>0? 1 : 0;
			NumArr[11] += ((1<<11)&i)>0? 1 : 0;
			NumArr[12] += ((1<<12)&i)>0? 1 : 0;
			NumArr[13] += ((1<<13)&i)>0? 1 : 0;
			NumArr[14] += ((1<<14)&i)>0? 1 : 0;
			NumArr[15] += ((1<<15)&i)>0? 1 : 0;
			
			NumArr[16] += ((1<<16)&i)>0? 1 : 0;
			NumArr[17] += ((1<<17)&i)>0? 1 : 0;
			NumArr[18] += ((1<<18)&i)>0? 1 : 0;
			NumArr[19] += ((1<<19)&i)>0? 1 : 0;
			NumArr[20] += ((1<<20)&i)>0? 1 : 0;
			NumArr[21] += ((1<<21)&i)>0? 1 : 0;
			NumArr[22] += ((1<<22)&i)>0? 1 : 0;
			NumArr[23] += ((1<<23)&i)>0? 1 : 0;
			
			NumArr[24] += ((1<<24)&i)>0? 1 : 0;
			NumArr[25] += ((1<<25)&i)>0? 1 : 0;
			NumArr[26] += ((1<<26)&i)>0? 1 : 0;
			NumArr[27] += ((1<<27)&i)>0? 1 : 0;
			NumArr[28] += ((1<<28)&i)>0? 1 : 0;
			NumArr[29] += ((1<<29)&i)>0? 1 : 0;
			NumArr[30] += ((1<<30)&i)>0? 1 : 0;
			NumArr[31] += ((1<<31)&i)>0? 1 : 0;
		}		
		for(int i = 0; i<NumArr.length ; i++){
			if(NumArr[i]%3 != 0){
				result += 1<<i;
			}
		}
		int found=0;
		for(int i : numbers){
			if(result==i) found =1;
		}
		if(found == 0){
			result = 0;
		   for(int i = 0; i<NumArr.length-1 ; i++){
			if(NumArr[i]%3 == 0){
				result += 1<<i;
			}
		   }
		   return -(result+1);
		}
		return result;
	}
}
