import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_i-m-able-to-connect-to-db-locally-but-when-i-m-trying-to-connect-using-script-i-m-having-this-error-earlier-this-script-used-to-work'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/i-m-able-to-connect-to-db-locally-but-when-i-m-trying-to-connect-using-script-i-m-having-this-error-earlier-this-script-used-to-work/79878')

'step 2: Add visual checkpoint at Page_t_i-m-able-to-connect-to-db-locally-but-when-i-m-trying-to-connect-using-script-i-m-having-this-error-earlier-this-script-used-to-work'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-01074_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
