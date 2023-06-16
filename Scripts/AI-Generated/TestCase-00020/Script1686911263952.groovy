import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_getting-started-part-6-get-recognized-for-your-contribution-with-the-kudos-rewards-scheme'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/getting-started-part-6-get-recognized-for-your-contribution-with-the-kudos-rewards-scheme/78544')

'step 2: Add visual checkpoint at Page_t_getting-started-part-6-get-recognized-for-your-contribution-with-the-kudos-rewards-scheme'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00020_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
