package hackerrank.easy;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

/**
 * https://www.hackerrank.com/challenges/beautiful-pairs/problem?isFullScreen=true
 */
public class BeautifulParis {

    private int beautifulPairs(int[] A, int[] B) {
        int matches = 0;
        int[] pairs = new int[1001];

        for (int i : A) pairs[i]++;
        for (int j : B) {
            if (0 < pairs[j]) {
                matches++;
                pairs[j]--;
            }
        }

        return A.length == matches ? matches - 1 : matches + 1;
    }

    @Test
    public void test1() {
        assertEquals(6, beautifulPairs(new int[] {3, 5, 7, 11, 5, 8}, new int[] {5, 7, 11, 10, 5, 8}));
    }

    @Test
    public void test2() {
        assertEquals(4, beautifulPairs(new int[] {1,2,3,4}, new int[] {1,2,3,3}));
    }

    @Test
    public void test3() {
        String A = "354 616 541 886 402 696 998 271 60 771 54 743 446 865 74 190 479 328 570 972 953 99 124 252 282 551 941 158 818 141 875 103 9 553 373 486 919 737 523 161 611 904 770 666 383 385 112 498 830 861 379 322 391 197 533 203 687 14 870 562 708 835 466 489 121 525 643 12 504 238 293 816 911 777 331 392 857 461 781 714 509 562 598 493 47 487 672 363 177 985 733 9 214 109 723 810 916 590 395 868 850 692 230 254 139 394 194 785 573 916 620 589 76 75 358 740 366 682 662 12 892 524 500 785 368 193 415 22 705 974 688 847 487 536 129 385 880 42 18 10 139 415 256 570 835 832 168 340 453 279 418 400 784 618 41 117 81 155 892 282 745 985 498 865 251 558 526 45 964 739 494 425 973 507 507 191 856 160 936 270 593 881 842 486 302 540 378 455 919 1 517 149 103 51 181 50 778 918 189 608 465 22 802 895 269 198 654 636 22 836 591 830 49 14 588 49 751 30 313 478 286 967 506 157 578 534 834 307 672 189 780 45 9 43 741 704 300 873 585 997 854 658 934 516 103 232 77 641 414 35 851 201 353 290 860 31 291 716 556 759 165 534 908 410 825 523 168 718 703 745 584 784 831 834 16 629 112 690 30 901 405 257 207 712 985 865 92 202 829 802 932 325 959 212 463 659 521 668 891 471 189 765 549 472 376 626 103 598 733 878 93 254 63 349 509 223 212 749 593 502 13 465 458 325 68 396 321 837 186 979 268 821 384 487 839 616 432 258 317 25 406 305 765 509 313 272 309 674 356 395 206 699 738 554 270 964 674 424 651 476 886 867 257 217 344 544 16 473 804 55 903 67 837 848 187 506 672 517 936 833 98 697 334 100 133 863 593 533 120 647 415 24 959 227 390 291 286 217 514 400 635 900 56 509 977 852 383 215 876 847 148 719 532 913 669 984 565 53 863 997 112 240 978 605 24 948 976 861 422 228 630 650 204 750 611 795 696 263 644 445 338 516 842 325 718 736 696 419 762 58 239 402 282 315 104 794 47 627 915 476 663 107 458 469 630 571 7 232 468 14 954 465 38 319 99 726 638 706 736 515 410 104 319 944 870 966 24 374 385 71 870 337 845 193 741 106 425 868 428 871 366 196 527 138 790 745 194 310 273 916 748 35 912 77 708 569 313 894 990 696 487 977 4 223 766 246 746 967 989 214 457 544 677 365 727 543 466 308 962 997 425 793 713 732 521 329 964 66 631 476 954 624 57 691 271 103 954 743 652 41 692 164 252 802 389 739 121 374 48 547 432 421 898 986 2 110 102 509 223 61 986 515 374 937 432 400 115 410 631 800 864 940 486 851 224 469 817 927 228 710 94 153 749 109 247 819 561 396 297 265 23 491 293 520 685 792 174 928 61 256 211 666 983 82 8 800 148 432 558 980 655 45 338 322 556 306 16 733 322 881 709 902 612 513 694 116 222 247 311 7 837 668 11 966 115 637 224 581 138 141 34 667 414 372 446 500 191 556 257 643 634 20 233 865 469 291 468 226 325 708 624 156 385 298 807 84 1000 361 689 735 249 879 85 700 115 396 448 46 403 556 990 937 980 587 615 65 458 959 451 738 663 561 80 797 561 397 9 188 259 157 929 342 116 2 465 930 233 979 677 112 99 150 817 139 127 866 449 920 838 21 797 647 499 676 281 938 297 103 543 883 730 58 116 611 133 641 509 600 544 637 805 412 60 749 947 746 266 337 388 923 85 675 384 485 537 436 434 572 688 949 18 397 119 192 437 562 147 266 714 164 415 243 583 47 340 365 426 27 704 142 654 843 594 649 334 59 190 466 579 387 382 205 69 926 720 806 633 917 748 576 980 252 776 39 882 945 452 408 225 109 706 511 768 8 876 2 259 875 137 784 530 768 942 410 42 303 53 197 961 528 989 427 512 862 958 437 911 345 102 580 263 298 151 859 968 923 695 49 254 516 354 548 431 128 365 607 752 144 131 912 569 870 863 484 315 284 430 791 142 70 859 757 641 181 64 44 813 384 186 615 499 508 810 960 122 207 779 381 962 671 557 286 338 969 725 359 481 770 625 1 962 207 319 982 775 428 636 282 710 925 693 652 931 681 625 540 315 56 581 894 371 766 636 88 924 885 596 583 724 561 578 566 761 856 883 531 921 924 308 12 308 472 634 446 437 306 485 42 303 74 777 72 362 990 923 135 347 244 945 323 19 174 782 821 649 25 886 192 817 618 232 974 139 113 726 7 559 851 507 556";
        String B = "556 507 851 559 7 726 113 139 974 232 618 817 192 886 25 649 821 782 174 19 323 945 244 347 135 923 990 362 72 777 74 303 42 485 306 437 446 634 472 308 12 308 924 921 531 883 856 761 566 578 561 724 583 596 885 924 88 636 766 371 894 581 56 315 540 625 681 931 652 693 925 710 282 636 428 775 982 319 207 962 1 625 770 481 359 725 969 338 286 557 671 962 381 779 207 122 960 810 508 499 615 186 384 813 44 64 181 641 757 859 70 142 791 430 284 315 484 863 870 569 912 131 144 752 607 365 128 431 548 354 516 254 49 695 923 968 859 151 298 263 580 102 345 911 437 958 862 512 427 989 528 961 197 53 303 42 410 942 768 530 784 137 875 259 2 876 8 768 511 706 109 225 408 452 945 882 39 776 252 980 576 748 917 633 806 720 926 69 205 382 387 579 466 190 59 334 649 594 843 654 142 704 27 426 365 340 47 583 243 415 164 714 266 147 562 437 192 119 397 18 949 688 572 434 436 537 485 384 675 85 923 388 337 266 746 947 749 60 412 805 637 544 600 509 641 133 611 116 58 730 883 543 103 297 938 281 676 499 647 797 21 838 920 449 866 127 139 817 150 99 112 677 979 233 930 465 2 116 342 929 157 259 188 9 397 561 797 80 561 663 738 451 959 458 65 615 587 980 937 990 556 403 46 448 396 115 700 85 879 249 735 689 361 1000 84 807 298 385 156 624 708 325 226 468 291 469 865 233 20 634 643 257 556 191 500 446 372 414 667 34 141 138 581 224 637 115 966 11 668 837 7 311 247 222 116 694 513 612 902 709 881 322 733 16 306 556 322 338 45 655 980 558 432 148 800 8 82 983 666 211 256 61 928 174 792 685 520 293 491 23 265 297 396 561 819 247 109 749 153 94 710 228 927 817 469 224 851 486 940 864 800 631 410 115 400 432 937 374 515 986 61 223 509 102 110 2 986 898 421 432 547 48 374 121 739 389 802 252 164 692 41 652 743 954 103 271 691 57 624 954 476 631 66 964 329 521 732 713 793 425 997 962 308 466 543 727 365 677 544 457 214 989 967 746 246 766 223 4 977 487 696 990 894 313 569 708 77 912 35 748 916 273 310 194 745 790 138 527 196 366 871 428 868 425 106 741 193 845 337 870 71 385 374 24 966 870 944 319 104 410 515 736 706 638 726 99 319 38 465 954 14 468 232 7 571 630 469 458 107 663 476 915 627 47 794 104 315 282 402 239 58 762 419 696 736 718 325 842 516 338 445 644 263 696 795 611 750 204 650 630 228 422 861 976 948 24 605 978 240 112 997 863 53 565 984 669 913 532 719 148 847 876 215 383 852 977 509 56 900 635 400 514 217 286 291 390 227 959 24 415 647 120 533 593 863 133 100 334 697 98 833 936 517 672 506 187 848 837 67 903 55 804 473 16 544 344 217 257 867 886 476 651 424 674 964 270 554 738 699 206 395 356 674 309 272 313 509 765 305 406 25 317 258 432 616 839 487 384 821 268 979 186 837 321 396 68 325 458 465 13 502 593 749 212 223 509 349 63 254 93 878 733 598 103 626 376 472 549 765 189 471 891 668 521 659 463 212 959 325 932 802 829 202 92 865 985 712 207 257 405 901 30 690 112 629 16 834 831 784 584 745 703 718 168 523 825 410 908 534 165 759 556 716 291 31 860 290 353 201 851 35 414 641 77 232 103 516 934 658 854 997 585 873 300 704 741 43 9 45 780 189 672 307 834 534 578 157 506 967 286 478 313 30 751 49 588 14 49 830 591 836 22 636 654 198 269 895 802 22 465 608 189 918 778 50 181 51 103 149 517 1 919 455 378 540 302 486 842 881 593 270 936 160 856 191 507 507 973 425 494 739 964 45 526 558 251 865 498 985 745 282 892 155 81 117 41 618 784 400 418 279 453 340 168 832 835 570 256 415 139 10 18 42 880 385 129 536 487 847 688 974 705 22 415 193 368 785 500 524 892 12 662 682 366 740 358 75 76 589 620 916 573 785 194 394 139 254 230 692 850 868 395 590 916 810 723 109 214 9 733 985 177 363 672 487 47 493 598 562 509 714 781 461 857 392 331 777 911 816 293 238 504 12 643 525 121 489 466 835 708 562 870 14 687 203 533 197 391 322 379 861 830 498 112 385 383 666 770 904 611 161 523 737 919 486 373 553 9 103 875 141 818 158 941 551 282 252 124 99 953 972 570 328 479 190 74 865 446 743 54 771 60 271 998 696 402 886 541 616 354";
        int[] a = Arrays.stream(A.split("\\s")).mapToInt(Integer::parseInt).toArray();
        int[] b = Arrays.stream(B.split("\\s")).mapToInt(Integer::parseInt).toArray();
        assertEquals(999, beautifulPairs(a, b));
    }
}