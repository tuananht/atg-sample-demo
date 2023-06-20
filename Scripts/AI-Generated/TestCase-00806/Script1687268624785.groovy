import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_your-trial-has-expired-while-having-available-kre-licences'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/your-trial-has-expired-while-having-available-kre-licences/53087')

'step 2: Add visual checkpoint at Page_t_your-trial-has-expired-while-having-available-kre-licences'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00806_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
