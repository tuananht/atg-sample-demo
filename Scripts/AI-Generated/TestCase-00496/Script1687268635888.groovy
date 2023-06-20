import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_we-have-not-seen-you-for-a-while-how-have-you-been'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/we-have-not-seen-you-for-a-while-how-have-you-been/86204')

'step 2: Add visual checkpoint at Page_t_we-have-not-seen-you-for-a-while-how-have-you-been'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00496_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
