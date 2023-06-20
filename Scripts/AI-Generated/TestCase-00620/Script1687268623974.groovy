import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_take-our-survey-to-win-exclusive-gifts-from-us'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/take-our-survey-to-win-exclusive-gifts-from-us/86758')

'step 2: Add visual checkpoint at Page_t_take-our-survey-to-win-exclusive-gifts-from-us'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00620_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
