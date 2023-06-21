import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_loop-rows-in-exel-2'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/loop-rows-in-exel-sheet/13557/2')

'step 2: Add visual checkpoint at Page_t_loop-rows-in-exel-2'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00059_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()