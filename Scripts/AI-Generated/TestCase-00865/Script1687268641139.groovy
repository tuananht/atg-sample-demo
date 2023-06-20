import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

'Initialize test session: Open browser and set view port'

WebUI.openBrowser('')

WebUI.setViewPortSize(1920, 1080)

'step 1: Navigate to Page_t_weird-java-lang-nosuchmethoderror-that-pops-up-when-trying-to-use-gmail-api-with-katalon-studio'

WebUI.navigateToUrl(GlobalVariable.application_domain + '/t/weird-java-lang-nosuchmethoderror-that-pops-up-when-trying-to-use-gmail-api-with-katalon-studio/79172')

'step 2: Add visual checkpoint at Page_t_weird-java-lang-nosuchmethoderror-that-pops-up-when-trying-to-use-gmail-api-with-katalon-studio'

WebUI.takeFullPageScreenshotAsCheckpoint('TestCase-00865_visual_checkpoint')

'Terminate test session: Close browser'

WebUI.closeBrowser()
