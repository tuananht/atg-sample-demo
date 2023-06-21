import internal.GlobalVariable as GlobalVariable
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_how-to-scroll-down-while-testing-mobile-apps'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/how-to-scroll-down-while-testing-mobile-apps/6445')

'step 2: Add visual checkpoint at Page_t_how-to-scroll-down-while-testing-mobile-apps'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00189_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
