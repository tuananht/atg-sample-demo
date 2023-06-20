import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_incorrect-element-im-mobile-test'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/incorrect-element-im-mobile-test/54897')

'step 2: Add visual checkpoint at Page_t_incorrect-element-im-mobile-test'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00792_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
